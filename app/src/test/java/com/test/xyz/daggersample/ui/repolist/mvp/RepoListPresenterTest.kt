@file:Suppress("IllegalIdentifier")
package com.test.xyz.daggersample.ui.repolist.mvp

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.mock
import com.test.xyz.daggersample.domain.interactor.MainInteractor
import com.test.xyz.daggersample.ui.BasePresenterTest
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*

class RepoListPresenterTest : BasePresenterTest() {

    lateinit var repoListPresenter: RepoListPresenter

    val repoListView: RepoListView = mock()
    val mainInteractor: MainInteractor = mock()

    @Before
    fun setup() {
        mockInteractor(mainInteractor)
        repoListPresenter = RepoListPresenterImpl(repoListView, mainInteractor)
    }

    @Test
    fun `requestRepoList shouldReturnRepoList`() {
        //GIVEN
        //NOTHING

        //WHEN
        repoListPresenter.requestRepoList(USER_NAME)

        //THEN
        verify(repoListView).showRepoList(any())
        verify(repoListView, never()).showError(any(String::class.java))
    }

    @Test
    fun `requestRepoList whenUserNameIsEmpty shouldReturnError`() {
        //GIVEN
        //NOTHING

        //WHEN
        repoListPresenter.requestRepoList("")

        //THEN
        verify(repoListView, never()).showRepoList(any())
        verify(repoListView, times(1)).showError(any(String::class.java))
    }

    companion object {
        private val USER_NAME = "google"
    }
}
