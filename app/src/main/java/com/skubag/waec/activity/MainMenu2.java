package com.skubag.waec.activity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.skubag.waec.BuildConfig;
import com.skubag.waec.R;
import com.skubag.waec.activity.about.AboutApp;
import com.skubag.waec.activity.about.AboutAppSimple;
import com.skubag.waec.activity.about.AboutAppSimpleBlue;
import com.skubag.waec.activity.about.AboutCompany;
import com.skubag.waec.activity.about.AboutCompanyCard;
import com.skubag.waec.activity.about.AboutCompanyImage;
import com.skubag.waec.activity.about.AboutDialogMainAction;
import com.skubag.waec.activity.article.ArticleBigHeader;
import com.skubag.waec.activity.article.ArticleCard;
import com.skubag.waec.activity.article.ArticleFood;
import com.skubag.waec.activity.article.ArticleFoodReview;
import com.skubag.waec.activity.article.ArticleMedium;
import com.skubag.waec.activity.article.ArticleMediumDark;
import com.skubag.waec.activity.article.ArticleSimple;
import com.skubag.waec.activity.article.ArticleStepper;
import com.skubag.waec.activity.bottomnavigation.BottomNavigationBasic;
import com.skubag.waec.activity.bottomnavigation.BottomNavigationDark;
import com.skubag.waec.activity.bottomnavigation.BottomNavigationIcon;
import com.skubag.waec.activity.bottomnavigation.BottomNavigationLight;
import com.skubag.waec.activity.bottomnavigation.BottomNavigationMapBlue;
import com.skubag.waec.activity.bottomnavigation.BottomNavigationPrimary;
import com.skubag.waec.activity.bottomnavigation.BottomNavigationShifting;
import com.skubag.waec.activity.bottomsheet.BottomSheetBasic;
import com.skubag.waec.activity.bottomsheet.BottomSheetFloating;
import com.skubag.waec.activity.bottomsheet.BottomSheetFull;
import com.skubag.waec.activity.bottomsheet.BottomSheetList;
import com.skubag.waec.activity.bottomsheet.BottomSheetMap;
import com.skubag.waec.activity.button.ButtonBasic;
import com.skubag.waec.activity.button.ButtonInUtilities;
import com.skubag.waec.activity.button.FabMiddle;
import com.skubag.waec.activity.button.FabMore;
import com.skubag.waec.activity.button.FabMoreText;
import com.skubag.waec.activity.card.CardBasic;
import com.skubag.waec.activity.card.CardOverlap;
import com.skubag.waec.activity.card.CardTimeline;
import com.skubag.waec.activity.card.CardWizard;
import com.skubag.waec.activity.card.CardWizardLight;
import com.skubag.waec.activity.card.CardWizardOverlap;
import com.skubag.waec.activity.chip.ChipBasic;
import com.skubag.waec.activity.chip.ChipTag;
import com.skubag.waec.activity.dashboard.DashboardCryptocurrency;
import com.skubag.waec.activity.dashboard.DashboardFinance;
import com.skubag.waec.activity.dashboard.DashboardFlight;
import com.skubag.waec.activity.dashboard.DashboardGridFab;
import com.skubag.waec.activity.dashboard.DashboardPayBill;
import com.skubag.waec.activity.dashboard.DashboardStatistics;
import com.skubag.waec.activity.dashboard.DashboardWallet;
import com.skubag.waec.activity.dashboard.DashboardWalletGreen;
import com.skubag.waec.activity.dialog.DialogAddPost;
import com.skubag.waec.activity.dialog.DialogAddReview;
import com.skubag.waec.activity.dialog.DialogBasic;
import com.skubag.waec.activity.dialog.DialogCustom;
import com.skubag.waec.activity.dialog.DialogCustomDark;
import com.skubag.waec.activity.dialog.DialogCustomInfo;
import com.skubag.waec.activity.dialog.DialogCustomLight;
import com.skubag.waec.activity.dialog.DialogCustomWarning;
import com.skubag.waec.activity.dialog.DialogFullscreen;
import com.skubag.waec.activity.dialog.DialogGDPRBasic;
import com.skubag.waec.activity.dialog.DialogHeader;
import com.skubag.waec.activity.dialog.DialogImage;
import com.skubag.waec.activity.dialog.DialogTermOfServices;
import com.skubag.waec.activity.expansionpanel.ExpansionPanelBasic;
import com.skubag.waec.activity.expansionpanel.ExpansionPanelInvoice;
import com.skubag.waec.activity.expansionpanel.ExpansionPanelTicket;
import com.skubag.waec.activity.form.FormLogin;
import com.skubag.waec.activity.form.FormProfileData;
import com.skubag.waec.activity.form.FormSignUp;
import com.skubag.waec.activity.form.FormTextArea;
import com.skubag.waec.activity.form.FormWithIcon;
import com.skubag.waec.activity.gridlist.GridAlbums;
import com.skubag.waec.activity.gridlist.GridBasic;
import com.skubag.waec.activity.gridlist.GridCaller;
import com.skubag.waec.activity.gridlist.GridSectioned;
import com.skubag.waec.activity.gridlist.GridSingleLine;
import com.skubag.waec.activity.gridlist.GridTwoLine;
import com.skubag.waec.activity.list.ListAnimation;
import com.skubag.waec.activity.list.ListBasic;
import com.skubag.waec.activity.list.ListDrag;
import com.skubag.waec.activity.list.ListExpand;
import com.skubag.waec.activity.list.ListMultiSelection;
import com.skubag.waec.activity.list.ListSectioned;
import com.skubag.waec.activity.list.ListSwipe;
import com.skubag.waec.activity.login.LoginCardLight;
import com.skubag.waec.activity.login.LoginCardOverlap;
import com.skubag.waec.activity.login.LoginImageTeal;
import com.skubag.waec.activity.login.LoginSimpleDark;
import com.skubag.waec.activity.login.LoginSimpleGreen;
import com.skubag.waec.activity.login.LoginSimpleLight;
import com.skubag.waec.activity.menu.MenuDrawerMail;
import com.skubag.waec.activity.menu.MenuDrawerNews;
import com.skubag.waec.activity.menu.MenuDrawerNoIcon;
import com.skubag.waec.activity.menu.MenuDrawerSimpleDark;
import com.skubag.waec.activity.menu.MenuDrawerSimpleLight;
import com.skubag.waec.activity.menu.MenuOverflowList;
import com.skubag.waec.activity.menu.MenuOverflowToolbar;
import com.skubag.waec.activity.noitem.NoItemArchived;
import com.skubag.waec.activity.noitem.NoItemBgCactus;
import com.skubag.waec.activity.noitem.NoItemBgCity;
import com.skubag.waec.activity.noitem.NoItemInternetIcon;
import com.skubag.waec.activity.noitem.NoItemInternetImage;
import com.skubag.waec.activity.noitem.NoItemSearch;
import com.skubag.waec.activity.noitem.NoItemTabs;
import com.skubag.waec.activity.payment.PaymentCardCollections;
import com.skubag.waec.activity.payment.PaymentCardDetails;
import com.skubag.waec.activity.payment.PaymentForm;
import com.skubag.waec.activity.payment.PaymentProfile;
import com.skubag.waec.activity.payment.PaymentSuccessDialog;
import com.skubag.waec.activity.picker.PickerColor;
import com.skubag.waec.activity.picker.PickerDateDark;
import com.skubag.waec.activity.picker.PickerDateLight;
import com.skubag.waec.activity.picker.PickerLocation;
import com.skubag.waec.activity.picker.PickerTimeDark;
import com.skubag.waec.activity.picker.PickerTimeLight;
import com.skubag.waec.activity.player.PlayerMusicAlbumCircle;
import com.skubag.waec.activity.player.PlayerMusicAlbumDark;
import com.skubag.waec.activity.player.PlayerMusicAlbumGrid;
import com.skubag.waec.activity.player.PlayerMusicAlbumSimple;
import com.skubag.waec.activity.player.PlayerMusicBasic;
import com.skubag.waec.activity.player.PlayerMusicGenre;
import com.skubag.waec.activity.player.PlayerMusicGenreImage;
import com.skubag.waec.activity.player.PlayerMusicGenreLight;
import com.skubag.waec.activity.player.PlayerMusicLight;
import com.skubag.waec.activity.player.PlayerMusicSongList;
import com.skubag.waec.activity.player.PlayerMusicTabs;
import com.skubag.waec.activity.player.PlayerMusicTabsIcon;
import com.skubag.waec.activity.player.PlayerVideoBasic;
import com.skubag.waec.activity.player.PlayerVideoSimple;
import com.skubag.waec.activity.profile.ProfileBlueAppbar;
import com.skubag.waec.activity.profile.ProfileCardList;
import com.skubag.waec.activity.profile.ProfileDrawerImage;
import com.skubag.waec.activity.profile.ProfileDrawerSimple;
import com.skubag.waec.activity.profile.ProfileFabMenu;
import com.skubag.waec.activity.profile.ProfileGallery;
import com.skubag.waec.activity.profile.ProfileGalleryTwo;
import com.skubag.waec.activity.profile.ProfileImageAppbar;
import com.skubag.waec.activity.profile.ProfilePolygon;
import com.skubag.waec.activity.profile.ProfilePurple;
import com.skubag.waec.activity.profile.ProfileRed;
import com.skubag.waec.activity.progressactivity.ProgressBasic;
import com.skubag.waec.activity.progressactivity.ProgressCircleCenter;
import com.skubag.waec.activity.progressactivity.ProgressDotsBounce;
import com.skubag.waec.activity.progressactivity.ProgressDotsFade;
import com.skubag.waec.activity.progressactivity.ProgressDotsGrow;
import com.skubag.waec.activity.progressactivity.ProgressLinearCenter;
import com.skubag.waec.activity.progressactivity.ProgressLinearTop;
import com.skubag.waec.activity.progressactivity.ProgressOnScroll;
import com.skubag.waec.activity.progressactivity.ProgressPullRefresh;
import com.skubag.waec.activity.search.SearchCity;
import com.skubag.waec.activity.search.SearchFilterHotel;
import com.skubag.waec.activity.search.SearchFilterProduct;
import com.skubag.waec.activity.search.SearchFilterProperty;
import com.skubag.waec.activity.search.SearchHistoryCard;
import com.skubag.waec.activity.search.SearchPrimary;
import com.skubag.waec.activity.search.SearchPrimaryBg;
import com.skubag.waec.activity.search.SearchStore;
import com.skubag.waec.activity.search.SearchToolbarDark;
import com.skubag.waec.activity.search.SearchToolbarLight;
import com.skubag.waec.activity.settings.SettingFlat;
import com.skubag.waec.activity.settings.SettingProfile;
import com.skubag.waec.activity.settings.SettingProfileLight;
import com.skubag.waec.activity.settings.SettingSectioned;
import com.skubag.waec.activity.shopping.ShoppingCartCard;
import com.skubag.waec.activity.shopping.ShoppingCartCardDark;
import com.skubag.waec.activity.shopping.ShoppingCartSimple;
import com.skubag.waec.activity.shopping.ShoppingCategoryCard;
import com.skubag.waec.activity.shopping.ShoppingCategoryImage;
import com.skubag.waec.activity.shopping.ShoppingCategoryList;
import com.skubag.waec.activity.shopping.ShoppingCheckoutCard;
import com.skubag.waec.activity.shopping.ShoppingCheckoutOnePage;
import com.skubag.waec.activity.shopping.ShoppingCheckoutStep;
import com.skubag.waec.activity.shopping.ShoppingCheckoutTimeline;
import com.skubag.waec.activity.shopping.ShoppingProductAdvDetails;
import com.skubag.waec.activity.shopping.ShoppingProductDetails;
import com.skubag.waec.activity.shopping.ShoppingProductGrid;
import com.skubag.waec.activity.shopping.ShoppingSubCategoryTabs;
import com.skubag.waec.activity.slider.SliderColorPicker;
import com.skubag.waec.activity.slider.SliderDark;
import com.skubag.waec.activity.slider.SliderLight;
import com.skubag.waec.activity.sliderimage.SliderImageCard;
import com.skubag.waec.activity.sliderimage.SliderImageCardAuto;
import com.skubag.waec.activity.sliderimage.SliderImageHeader;
import com.skubag.waec.activity.sliderimage.SliderImageHeaderAuto;
import com.skubag.waec.activity.snackbartoast.SnackbarAndFab;
import com.skubag.waec.activity.snackbartoast.SnackbarToastBasic;
import com.skubag.waec.activity.stepper.StepperDots;
import com.skubag.waec.activity.stepper.StepperProgress;
import com.skubag.waec.activity.stepper.StepperText;
import com.skubag.waec.activity.stepper.StepperVertical;
import com.skubag.waec.activity.stepper.StepperWizardColor;
import com.skubag.waec.activity.stepper.StepperWizardLight;
import com.skubag.waec.activity.tabs.TabsBasic;
import com.skubag.waec.activity.tabs.TabsDark;
import com.skubag.waec.activity.tabs.TabsIcon;
import com.skubag.waec.activity.tabs.TabsIconLight;
import com.skubag.waec.activity.tabs.TabsIconStack;
import com.skubag.waec.activity.tabs.TabsLight;
import com.skubag.waec.activity.tabs.TabsRound;
import com.skubag.waec.activity.tabs.TabsScroll;
import com.skubag.waec.activity.tabs.TabsStore;
import com.skubag.waec.activity.tabs.TabsTextIcon;
import com.skubag.waec.activity.timeline.TimelineDotCard;
import com.skubag.waec.activity.timeline.TimelineFeed;
import com.skubag.waec.activity.timeline.TimelinePath;
import com.skubag.waec.activity.timeline.TimelineSimple;
import com.skubag.waec.activity.timeline.TimelineTwitter;
import com.skubag.waec.activity.toolbar.ToolbarBasic;
import com.skubag.waec.activity.toolbar.ToolbarCollapse;
import com.skubag.waec.activity.toolbar.ToolbarCollapsePin;
import com.skubag.waec.activity.toolbar.ToolbarDark;
import com.skubag.waec.activity.toolbar.ToolbarLight;
import com.skubag.waec.activity.verification.VerificationBlue;
import com.skubag.waec.activity.verification.VerificationCode;
import com.skubag.waec.activity.verification.VerificationHeader;
import com.skubag.waec.activity.verification.VerificationImage;
import com.skubag.waec.activity.verification.VerificationOrange;
import com.skubag.waec.activity.verification.VerificationPhone;
import com.skubag.waec.adapter.ExpandableRecyclerAdapter;
import com.skubag.waec.adapter.MainMenuAdapter;
import com.skubag.waec.data.SharedPref;
import com.skubag.waec.model.MenuType;
import com.skubag.waec.utils.Tools;

import java.util.ArrayList;
import java.util.List;

public class MainMenu2 extends AppCompatActivity {

    private RecyclerView recycler;
    private MainMenuAdapter adapter;
    private SharedPref sharedPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPref = new SharedPref(this);
        initComponentMenu();
        Tools.setSystemBarColor(this, R.color.grey_1000);
    }

    private void initComponentMenu() {
        recycler = (RecyclerView) findViewById(R.id.main_recycler);
        adapter = new MainMenuAdapter(this, generateMenuItems(), new MainMenuAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int itemId) {
                onMenuItemSelected(itemId);
            }
        });
        ((ImageButton) findViewById(R.id.bt_about)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogAbout();
            }
        });

        adapter.setMode(ExpandableRecyclerAdapter.MODE_ACCORDION);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        recycler.setNestedScrollingEnabled(false);
        recycler.setAdapter(adapter);

        if (sharedPref.isFirstLaunch()) {
            showDialogAbout();
        }
    }

    private void onMenuItemSelected(int itemId) {

        if (sharedPref.actionClickOffer()) {
            showDialogOffer();
            return;
        }

        switch (itemId) {
            // Bottom Navigation -------------------------------------------------------------------
            case 101:
                startActivity(new Intent(this, BottomNavigationBasic.class));
                break;
            case 102:
                startActivity(new Intent(this, BottomNavigationShifting.class));
                break;
            case 103:
                startActivity(new Intent(this, BottomNavigationLight.class));
                break;
            case 104:
                startActivity(new Intent(this, BottomNavigationDark.class));
                break;
            case 105:
                startActivity(new Intent(this, BottomNavigationIcon.class));
                break;
            case 106:
                startActivity(new Intent(this, BottomNavigationPrimary.class));
                break;
            case 107:
                startActivity(new Intent(this, BottomNavigationMapBlue.class));
                break;

            // Bottom Sheet ------------------------------------------------------------------------
            case 201:
                startActivity(new Intent(this, BottomSheetBasic.class));
                break;
            case 202:
                startActivity(new Intent(this, BottomSheetList.class));
                break;
            case 203:
                startActivity(new Intent(this, BottomSheetMap.class));
                break;
            case 204:
                startActivity(new Intent(this, BottomSheetFloating.class));
                break;
            case 205:
                startActivity(new Intent(this, BottomSheetFull.class));
                break;

            // Buttons -----------------------------------------------------------------------------
            case 301:
                startActivity(new Intent(this, ButtonBasic.class));
                break;
            case 302:
                startActivity(new Intent(this, ButtonInUtilities.class));
                break;
            case 303:
                startActivity(new Intent(this, FabMiddle.class));
                break;
            case 304:
                startActivity(new Intent(this, FabMore.class));
                break;
            case 305:
                startActivity(new Intent(this, FabMoreText.class));
                break;

            // Cards -------------------------------------------------------------------------------
            case 401:
                startActivity(new Intent(this, CardBasic.class));
                break;
            case 402:
                startActivity(new Intent(this, CardTimeline.class));
                break;
            case 403:
                startActivity(new Intent(this, CardOverlap.class));
                break;
            case 404:
                startActivity(new Intent(this, CardWizard.class));
                break;
            case 405:
                startActivity(new Intent(this, CardWizardLight.class));
                break;
            case 406:
                startActivity(new Intent(this, CardWizardOverlap.class));
                break;

            // Chips -------------------------------------------------------------------------------
            case 501:
                startActivity(new Intent(this, ChipBasic.class));
                break;
            case 502:
                startActivity(new Intent(this, ChipTag.class));
                break;

            // Dialogs -----------------------------------------------------------------------------
            case 601:
                startActivity(new Intent(this, DialogBasic.class));
                break;
            case 602:
                startActivity(new Intent(this, DialogFullscreen.class));
                break;
            case 603:
                startActivity(new Intent(this, DialogCustom.class));
                break;
            case 604:
                startActivity(new Intent(this, DialogCustomInfo.class));
                break;
            case 605:
                startActivity(new Intent(this, DialogCustomWarning.class));
                break;
            case 606:
                startActivity(new Intent(this, DialogCustomLight.class));
                break;
            case 607:
                startActivity(new Intent(this, DialogCustomDark.class));
                break;
            case 608:
                startActivity(new Intent(this, DialogAddPost.class));
                break;
            case 609:
                startActivity(new Intent(this, DialogAddReview.class));
                break;
            case 610:
                startActivity(new Intent(this, DialogGDPRBasic.class));
                break;
            case 611:
                startActivity(new Intent(this, DialogTermOfServices.class));
                break;
            case 612:
                startActivity(new Intent(this, DialogHeader.class));
                break;
            case 613:
                startActivity(new Intent(this, DialogImage.class));
                break;

            // Expansion Panels --------------------------------------------------------------------
            case 701:
                startActivity(new Intent(this, ExpansionPanelBasic.class));
                break;
            case 702:
                startActivity(new Intent(this, ExpansionPanelInvoice.class));
                break;
            case 703:
                startActivity(new Intent(this, ExpansionPanelTicket.class));
                break;

            // Grid Lists --------------------------------------------------------------------------
            case 801:
                startActivity(new Intent(this, GridBasic.class));
                break;
            case 802:
                startActivity(new Intent(this, GridSingleLine.class));
                break;
            case 803:
                startActivity(new Intent(this, GridTwoLine.class));
                break;
            case 804:
                startActivity(new Intent(this, GridSectioned.class));
                break;
            case 805:
                startActivity(new Intent(this, GridAlbums.class));
                break;
            case 806:
                startActivity(new Intent(this, GridCaller.class));
                break;

            // Lists -------------------------------------------------------------------------------
            case 901:
                startActivity(new Intent(this, ListBasic.class));
                break;
            case 902:
                startActivity(new Intent(this, ListSectioned.class));
                break;
            case 903:
                startActivity(new Intent(this, ListAnimation.class));
                break;
            case 904:
                startActivity(new Intent(this, ListExpand.class));
                break;
            case 905:
                startActivity(new Intent(this, ListDrag.class));
                break;
            case 906:
                startActivity(new Intent(this, ListSwipe.class));
                break;
            case 907:
                startActivity(new Intent(this, ListMultiSelection.class));
                break;

            // Menu --------------------------------------------------------------------------------
            case 2001:
                startActivity(new Intent(this, MenuDrawerNews.class));
                break;
            case 2002:
                startActivity(new Intent(this, MenuDrawerMail.class));
                break;
            case 2003:
                startActivity(new Intent(this, MenuDrawerSimpleLight.class));
                break;
            case 2004:
                startActivity(new Intent(this, MenuDrawerSimpleDark.class));
                break;
            case 2005:
                startActivity(new Intent(this, MenuDrawerNoIcon.class));
                break;
            case 2006:
                startActivity(new Intent(this, MenuOverflowToolbar.class));
                break;
            case 2007:
                startActivity(new Intent(this, MenuOverflowList.class));
                break;

            // Pickers -----------------------------------------------------------------------------
            case 1001:
                startActivity(new Intent(this, PickerDateLight.class));
                break;
            case 1002:
                startActivity(new Intent(this, PickerDateDark.class));
                break;
            case 1003:
                startActivity(new Intent(this, PickerTimeLight.class));
                break;
            case 1004:
                startActivity(new Intent(this, PickerTimeDark.class));
                break;
            case 1005:
                startActivity(new Intent(this, PickerColor.class));
                break;
            case 1006:
                startActivity(new Intent(this, PickerLocation.class));
                break;

            // Progress & Activity -----------------------------------------------------------------
            case 1101:
                startActivity(new Intent(this, ProgressBasic.class));
                break;
            case 1102:
                startActivity(new Intent(this, ProgressLinearCenter.class));
                break;
            case 1103:
                startActivity(new Intent(this, ProgressLinearTop.class));
                break;
            case 1104:
                startActivity(new Intent(this, ProgressCircleCenter.class));
                break;
            case 1105:
                startActivity(new Intent(this, ProgressOnScroll.class));
                break;
            case 1106:
                startActivity(new Intent(this, ProgressPullRefresh.class));
                break;
            case 1107:
                startActivity(new Intent(this, ProgressDotsBounce.class));
                break;
            case 1108:
                startActivity(new Intent(this, ProgressDotsFade.class));
                break;
            case 1109:
                startActivity(new Intent(this, ProgressDotsGrow.class));
                break;

            // Sliders -----------------------------------------------------------------------------
            case 1201:
                startActivity(new Intent(this, SliderLight.class));
                break;
            case 1202:
                startActivity(new Intent(this, SliderDark.class));
                break;
            case 1203:
                startActivity(new Intent(this, SliderColorPicker.class));
                break;

            // Snackbars & Toasts ------------------------------------------------------------------
            case 1301:
                startActivity(new Intent(this, SnackbarToastBasic.class));
                break;
            case 1302:
                startActivity(new Intent(this, SnackbarAndFab.class));
                break;

            // Steppers ----------------------------------------------------------------------------
            case 1401:
                startActivity(new Intent(this, StepperText.class));
                break;
            case 1402:
                startActivity(new Intent(this, StepperDots.class));
                break;
            case 1403:
                startActivity(new Intent(this, StepperProgress.class));
                break;
            case 1404:
                startActivity(new Intent(this, StepperVertical.class));
                break;
            case 1405:
                startActivity(new Intent(this, StepperWizardLight.class));
                break;
            case 1406:
                startActivity(new Intent(this, StepperWizardColor.class));
                break;

            // Tabs --------------------------------------------------------------------------------
            case 1501:
                startActivity(new Intent(this, TabsBasic.class));
                break;
            case 1502:
                startActivity(new Intent(this, TabsStore.class));
                break;
            case 1503:
                startActivity(new Intent(this, TabsLight.class));
                break;
            case 1504:
                startActivity(new Intent(this, TabsDark.class));
                break;
            case 1505:
                startActivity(new Intent(this, TabsIcon.class));
                break;
            case 1506:
                startActivity(new Intent(this, TabsTextIcon.class));
                break;
            case 1507:
                startActivity(new Intent(this, TabsIconLight.class));
                break;
            case 1508:
                startActivity(new Intent(this, TabsIconStack.class));
                break;
            case 1509:
                startActivity(new Intent(this, TabsScroll.class));
                break;
            case 1510:
                startActivity(new Intent(this, TabsRound.class));
                break;

            // Form --------------------------------------------------------------------------------
            case 1601:
                startActivity(new Intent(this, FormLogin.class));
                break;
            case 1602:
                startActivity(new Intent(this, FormSignUp.class));
                break;
            case 1603:
                startActivity(new Intent(this, FormProfileData.class));
                break;
            case 1604:
                startActivity(new Intent(this, FormWithIcon.class));
                break;
            case 1605:
                startActivity(new Intent(this, FormTextArea.class));
                break;

            // Toolbars ----------------------------------------------------------------------------
            case 1701:
                startActivity(new Intent(this, ToolbarBasic.class));
                break;
            case 1702:
                startActivity(new Intent(this, ToolbarCollapse.class));
                break;
            case 1703:
                startActivity(new Intent(this, ToolbarCollapsePin.class));
                break;
            case 1704:
                startActivity(new Intent(this, ToolbarLight.class));
                break;
            case 1705:
                startActivity(new Intent(this, ToolbarDark.class));
                break;

            // Profile -----------------------------------------------------------------------------
            case 1801:
                startActivity(new Intent(this, ProfilePolygon.class));
                break;
            case 1802:
                startActivity(new Intent(this, ProfilePurple.class));
                break;
            case 1803:
                startActivity(new Intent(this, ProfileRed.class));
                break;
            case 1804:
                startActivity(new Intent(this, ProfileBlueAppbar.class));
                break;
            case 1805:
                startActivity(new Intent(this, ProfileImageAppbar.class));
                break;
            case 1806:
                startActivity(new Intent(this, ProfileDrawerSimple.class));
                break;
            case 1807:
                startActivity(new Intent(this, ProfileDrawerImage.class));
                break;
            case 1808:
                startActivity(new Intent(this, ProfileGallery.class));
                break;
            case 1809:
                startActivity(new Intent(this, ProfileGalleryTwo.class));
                break;
            case 1810:
                startActivity(new Intent(this, ProfileCardList.class));
                break;
            case 1811:
                startActivity(new Intent(this, ProfileFabMenu.class));
                break;

            // No Item Page ------------------------------------------------------------------------
            case 19001:
                startActivity(new Intent(this, NoItemArchived.class));
                break;
            case 19002:
                startActivity(new Intent(this, NoItemSearch.class));
                break;
            case 19003:
                startActivity(new Intent(this, NoItemInternetIcon.class));
                break;
            case 19004:
                startActivity(new Intent(this, NoItemInternetImage.class));
                break;
            case 19005:
                startActivity(new Intent(this, NoItemBgCity.class));
                break;
            case 19006:
                startActivity(new Intent(this, NoItemBgCactus.class));
                break;
            case 19007:
                startActivity(new Intent(this, NoItemTabs.class));
                break;

            // Player ------------------------------------------------------------------------------
            case 20001:
                startActivity(new Intent(this, PlayerMusicBasic.class));
                break;
            case 20002:
                startActivity(new Intent(this, PlayerMusicLight.class));
                break;
            case 20003:
                startActivity(new Intent(this, PlayerMusicAlbumDark.class));
                break;
            case 20004:
                startActivity(new Intent(this, PlayerMusicAlbumCircle.class));
                break;
            case 20005:
                startActivity(new Intent(this, PlayerMusicAlbumSimple.class));
                break;
            case 20006:
                startActivity(new Intent(this, PlayerMusicSongList.class));
                break;
            case 20007:
                startActivity(new Intent(this, PlayerMusicAlbumGrid.class));
                break;
            case 20008:
                startActivity(new Intent(this, PlayerMusicTabs.class));
                break;
            case 20009:
                startActivity(new Intent(this, PlayerMusicTabsIcon.class));
                break;
            case 20010:
                startActivity(new Intent(this, PlayerMusicGenre.class));
                break;
            case 20011:
                startActivity(new Intent(this, PlayerMusicGenreImage.class));
                break;
            case 20012:
                startActivity(new Intent(this, PlayerMusicGenreLight.class));
                break;
            case 20013:
                startActivity(new Intent(this, PlayerVideoBasic.class));
                break;
            case 20014:
                startActivity(new Intent(this, PlayerVideoSimple.class));
                break;

            // Timeline ----------------------------------------------------------------------------
            case 21001:
                startActivity(new Intent(this, TimelineFeed.class));
                break;
            case 21002:
                startActivity(new Intent(this, TimelinePath.class));
                break;
            case 21003:
                startActivity(new Intent(this, TimelineDotCard.class));
                break;
            case 21004:
                startActivity(new Intent(this, TimelineTwitter.class));
                break;
            case 21005:
                startActivity(new Intent(this, TimelineSimple.class));
                break;

            // Shopping ----------------------------------------------------------------------------
            case 22001:
                startActivity(new Intent(this, ShoppingCategoryList.class));
                break;
            case 22002:
                startActivity(new Intent(this, ShoppingCategoryCard.class));
                break;
            case 22003:
                startActivity(new Intent(this, ShoppingCategoryImage.class));
                break;
            case 22004:
                startActivity(new Intent(this, ShoppingSubCategoryTabs.class));
                break;
            case 22005:
                startActivity(new Intent(this, ShoppingProductGrid.class));
                break;
            case 22006:
                startActivity(new Intent(this, ShoppingProductDetails.class));
                break;
            case 22007:
                startActivity(new Intent(this, ShoppingProductAdvDetails.class));
                break;
            case 22008:
                startActivity(new Intent(this, ShoppingCheckoutCard.class));
                break;
            case 22009:
                startActivity(new Intent(this, ShoppingCheckoutStep.class));
                break;
            case 22010:
                startActivity(new Intent(this, ShoppingCheckoutOnePage.class));
                break;
            case 22011:
                startActivity(new Intent(this, ShoppingCheckoutTimeline.class));
                break;
            case 22012:
                startActivity(new Intent(this, ShoppingCartSimple.class));
                break;
            case 22013:
                startActivity(new Intent(this, ShoppingCartCard.class));
                break;
            case 22014:
                startActivity(new Intent(this, ShoppingCartCardDark.class));
                break;

            // Search Page -------------------------------------------------------------------------
            case 23001:
                startActivity(new Intent(this, SearchToolbarLight.class));
                break;
            case 23002:
                startActivity(new Intent(this, SearchToolbarDark.class));
                break;
            case 23003:
                startActivity(new Intent(this, SearchStore.class));
                break;
            case 23004:
                startActivity(new Intent(this, SearchPrimary.class));
                break;
            case 23005:
                startActivity(new Intent(this, SearchPrimaryBg.class));
                break;
            case 23006:
                startActivity(new Intent(this, SearchHistoryCard.class));
                break;
            case 23007:
                startActivity(new Intent(this, SearchCity.class));
                break;
            case 23008:
                startActivity(new Intent(this, SearchFilterHotel.class));
                break;
            case 23009:
                startActivity(new Intent(this, SearchFilterProduct.class));
                break;
            case 23010:
                startActivity(new Intent(this, SearchFilterProperty.class));
                break;

            // Slider Image ------------------------------------------------------------------------
            case 24001:
                startActivity(new Intent(this, SliderImageHeader.class));
                break;
            case 24002:
                startActivity(new Intent(this, SliderImageHeaderAuto.class));
                break;
            case 24003:
                startActivity(new Intent(this, SliderImageCard.class));
                break;
            case 24004:
                startActivity(new Intent(this, SliderImageCardAuto.class));
                break;

            // Setting -----------------------------------------------------------------------------
            case 25001:
                startActivity(new Intent(this, SettingSectioned.class));
                break;
            case 25002:
                startActivity(new Intent(this, SettingFlat.class));
                break;
            case 25003:
                startActivity(new Intent(this, SettingProfile.class));
                break;
            case 25004:
                startActivity(new Intent(this, SettingProfileLight.class));
                break;

            // Verification ------------------------------------------------------------------------
            case 26001:
                startActivity(new Intent(this, VerificationPhone.class));
                break;
            case 26002:
                startActivity(new Intent(this, VerificationCode.class));
                break;
            case 26003:
                startActivity(new Intent(this, VerificationHeader.class));
                break;
            case 26004:
                startActivity(new Intent(this, VerificationImage.class));
                break;
            case 26005:
                startActivity(new Intent(this, VerificationBlue.class));
                break;
            case 26006:
                startActivity(new Intent(this, VerificationOrange.class));
                break;

            // Login -------------------------------------------------------------------------------
            case 27001:
                startActivity(new Intent(this, LoginSimpleLight.class));
                break;
            case 27002:
                startActivity(new Intent(this, LoginSimpleDark.class));
                break;
            case 27003:
                startActivity(new Intent(this, LoginSimpleGreen.class));
                break;
            case 27004:
                startActivity(new Intent(this, LoginImageTeal.class));
                break;
            case 27005:
                startActivity(new Intent(this, LoginCardLight.class));
                break;
            case 27006:
                startActivity(new Intent(this, LoginCardOverlap.class));
                break;

            // Payment -----------------------------------------------------------------------------
            case 28001:
                startActivity(new Intent(this, PaymentCardCollections.class));
                break;
            case 28002:
                startActivity(new Intent(this, PaymentCardDetails.class));
                break;
            case 28003:
                startActivity(new Intent(this, PaymentForm.class));
                break;
            case 28004:
                startActivity(new Intent(this, PaymentProfile.class));
                break;
            case 28005:
                startActivity(new Intent(this, PaymentSuccessDialog.class));
                break;

            // Dashboard ---------------------------------------------------------------------------
            case 29001:
                startActivity(new Intent(this, DashboardGridFab.class));
                break;
            case 29002:
                startActivity(new Intent(this, DashboardStatistics.class));
                break;
            case 29003:
                startActivity(new Intent(this, DashboardPayBill.class));
                break;
            case 29004:
                startActivity(new Intent(this, DashboardFlight.class));
                break;
            case 29005:
                startActivity(new Intent(this, DashboardWallet.class));
                break;
            case 29006:
                startActivity(new Intent(this, DashboardWalletGreen.class));
                break;
            case 29007:
                startActivity(new Intent(this, DashboardFinance.class));
                break;
            case 29008:
                startActivity(new Intent(this, DashboardCryptocurrency.class));
                break;

            // Article -----------------------------------------------------------------------------
            case 30001:
                startActivity(new Intent(this, ArticleSimple.class));
                break;
            case 30002:
                startActivity(new Intent(this, ArticleMedium.class));
                break;
            case 30003:
                startActivity(new Intent(this, ArticleMediumDark.class));
                break;
            case 30004:
                startActivity(new Intent(this, ArticleBigHeader.class));
                break;
            case 30005:
                startActivity(new Intent(this, ArticleStepper.class));
                break;
            case 30006:
                startActivity(new Intent(this, ArticleCard.class));
                break;
            case 30007:
                startActivity(new Intent(this, ArticleFood.class));
                break;
            case 30008:
                startActivity(new Intent(this, ArticleFoodReview.class));
                break;


            // About -------------------------------------------------------------------------------
            case 31001:
                startActivity(new Intent(this, AboutApp.class));
                break;
            case 31002:
                startActivity(new Intent(this, AboutAppSimple.class));
                break;
            case 31003:
                startActivity(new Intent(this, AboutAppSimpleBlue.class));
                break;
            case 31004:
                startActivity(new Intent(this, AboutCompany.class));
                break;
            case 31005:
                startActivity(new Intent(this, AboutCompanyImage.class));
                break;
            case 31006:
                startActivity(new Intent(this, AboutCompanyCard.class));
                break;
            case 31007:
                startActivity(new Intent(this, AboutDialogMainAction.class));
                break;

            // about material x ---------------------------------------------------------------------
            case 1:
                showDialogAbout();
                break;
        }
    }

    private List<MainMenuAdapter.ListItem> generateMenuItems() {
        List<MainMenuAdapter.ListItem> items = new ArrayList<>();

        items.add(new MainMenuAdapter.ListItem(-1, null, -1, MenuType.DIVIDER));
        items.add(new MainMenuAdapter.ListItem(100, "Bottom Navigation", R.drawable.ic_view_column, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(101, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(102, "Shifting", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(103, "Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(104, "Dark", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(105, "Icon", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(106, "Primary", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(107, "Map Blue", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(200, "Bottom Sheet", R.drawable.ic_call_to_actio, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(201, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(202, "List", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(203, "Map", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(204, "Floating", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(205, "Full", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(300, "Buttons", R.drawable.ic_touch_app, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(301, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(302, "Button In Utilities", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(303, "Fab Middle", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(304, "Fab More", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(305, "Fab More Text", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(400, "Cards", R.drawable.ic_note, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(401, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(402, "Timeline", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(403, "Overlap", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(404, "Wizard", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(405, "Wizard Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(406, "Wizard Overlap", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(500, "Chips", R.drawable.ic_label, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(501, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(502, "Tag", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(600, "Dialogs", R.drawable.ic_picture_in_picture, true, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(601, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(602, "Fullscreen", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(603, "Custom", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(604, "Custom Info", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(605, "Custom Warning", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(606, "Custom Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(607, "Custom Dark", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(608, "Custom Add Post", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(609, "Custom Add Review", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(610, "GDPR Basic", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(611, "Term of Services", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(612, "Header", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(613, "Image", -1, true, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(700, "Expansion Panels", R.drawable.ic_arrow_downward, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(701, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(702, "Invoice", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(703, "Ticket", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(800, "Grid", R.drawable.ic_apps, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(801, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(802, "Single Line", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(803, "Two Line", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(804, "Sectioned", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(805, "Albums", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(806, "Caller", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(900, "Lists", R.drawable.ic_view_stream, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(901, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(902, "Sectioned", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(903, "Animation", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(904, "Expand", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(905, "Draggable", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(906, "Swipe", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(907, "Multi Selection", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(2000, "Menu", R.drawable.ic_reoder, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(2001, "Drawer News", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(2002, "Drawer Mail", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(2003, "Drawer Simple Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(2004, "Drawer Simple Dark", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(2005, "Drawer No Icon", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(2006, "Overflow Toolbar", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(2007, "Overflow List", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(1000, "Pickers", R.drawable.ic_event, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(1001, "Date Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1002, "Date Dark", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1003, "Time Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1004, "Time Dark", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1005, "Color RGB", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1006, "Location", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(1100, "Progress & Activity", R.drawable.ic_settings_backup_restore, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(1101, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1102, "Linear Center", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1103, "Linear Top", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1104, "Circle Center", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1105, "On Scroll", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1106, "Pull Refresh", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1107, "Dots Bounce", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1108, "Dots Fade", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1109, "Dots Grow", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(1200, "Sliders", R.drawable.ic_tune, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(1201, "Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1202, "Dark", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1203, "Color Picker", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(1300, "Snackbars & Toasts", R.drawable.ic_wb_iridescent, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(1301, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1302, "Lift FAB", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(1400, "Steppers", R.drawable.ic_timeline, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(1401, "Text", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1402, "Dots", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1403, "Progress", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1404, "Vertical", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1405, "Wizard Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1406, "Wizard Color", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(1500, "Tabs", R.drawable.ic_tabs, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(1501, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1502, "Store", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1503, "Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1504, "Dark", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1505, "Icon", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1506, "Text & Icon", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1507, "Icon Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1508, "Icon Stack", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1509, "Scroll", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1510, "Round", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(1600, "Form", R.drawable.ic_assignment, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(1601, "Login", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1602, "Sign Up", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1603, "Profile Data", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1604, "With Icon", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1605, "Text Area", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(1700, "Toolbars", R.drawable.ic_web_asset, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(1701, "Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1702, "Collapse", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1703, "Collapse And Pin", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1704, "Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1705, "Dark", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(-1, "Extra", -1, MenuType.DIVIDER));

        items.add(new MainMenuAdapter.ListItem(1800, "Profile", R.drawable.ic_person, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(1801, "Polygon", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1802, "Purple", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1803, "Red", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1804, "Blue Appbar", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1805, "Image Appbar", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1806, "Drawer Simple", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1807, "Drawer Image", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1808, "Gallery", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1809, "Gallery Two", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1810, "Card List", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(1811, "Fab Menu", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(19000, "No Item Page", R.drawable.ic_do_not_disturb_off, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(19001, "Archived", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(19002, "Search", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(19003, "Internet Icon", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(19004, "Internet Image", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(19005, "Bg City", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(19006, "Bg Cactus", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(19007, "Tabs", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(20000, "Player", R.drawable.ic_live_tv, true, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(20001, "Music Basic", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20002, "Music Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20003, "Music Album Dark", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20004, "Music Album Circle", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20005, "Music Album Simple", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20006, "Music Song List", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20007, "Music Album Grid", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20008, "Music Tabs", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20009, "Music Tabs Icon", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20010, "Music Genre", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20011, "Music Genre Image", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20012, "Music Genre Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20011, "Music Genre Image", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20012, "Music Genre Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20013, "Video Basic", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(20014, "Video Simple", -1, true, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(21000, "Timeline", R.drawable.ic_wrap_text, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(21001, "Timeline Feed", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(21002, "Timeline Path", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(21003, "Timeline Dot Card", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(21004, "Timeline Twitter", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(21005, "Timeline Simple", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(22000, "Shopping", R.drawable.ic_shopping_cart, true, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(22001, "Category List", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22002, "Category Card", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22003, "Category Image", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22004, "Sub Category Tabs", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22005, "Product Grid", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22006, "Product Details", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22007, "Product Adv Details", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22008, "Checkout Card", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22009, "Checkout Step", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22010, "Checkout One Page", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22011, "Checkout Timeline", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22012, "Cart Simple", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22013, "Cart Card", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(22014, "Cart Dark", -1, true, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(23000, "Search Page", R.drawable.ic_search, true, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(23001, "Toolbar Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(23002, "Toolbar Dark", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(23003, "Store", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(23004, "Primary", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(23005, "Primary Bg", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(23006, "History Card", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(23007, "City", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(23008, "Filter Hotel", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(23009, "Filter Product", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(23010, "Filter Property", -1, true, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(24000, "Slider Image", R.drawable.ic_photo_library, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(24001, "Header", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(24002, "Header Auto", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(24003, "Card", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(24004, "Card Auto", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(25000, "Settings", R.drawable.ic_settings, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(25001, "Sectioned", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(25002, "Flat", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(25003, "Profile", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(25004, "Profile Light", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(26000, "Verification", R.drawable.ic_check_circle, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(26001, "Phone", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(26002, "Code", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(26003, "Header", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(26004, "Image", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(26005, "Blue", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(26006, "Orange", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(27000, "Login", R.drawable.ic_https, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(27001, "Simple Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(27002, "Simple Dark", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(27003, "Simple Green", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(27004, "Image Teal", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(27005, "Card Light", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(27006, "Card Overlap", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(28000, "Payment", R.drawable.ic_monetization_on, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(28001, "Card Collections", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(28002, "Card Details", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(28003, "Form", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(28004, "Profile", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(28005, "Success Dialog", -1, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(29000, "Dashboard", R.drawable.ic_event_seat, true, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(29001, "Grid Fab", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(29002, "Statistics", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(29003, "Pay Bill", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(29004, "Flight", -1, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(29005, "Wallet", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(29006, "Wallet Green", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(29007, "Finance", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(29008, "Cryptocurrency", -1, true, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(30000, "Article", R.drawable.ic_subject, true, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(30001, "Simple", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(30002, "Medium", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(30003, "Medium Dark", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(30004, "Big Header", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(30005, "Stepper", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(30006, "Card", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(30007, "Food", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(30008, "Food Review", -1, true, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(31000, "About", R.drawable.ic_perm_device_info, true, MenuType.HEADER));
        items.add(new MainMenuAdapter.ListItem(31001, "App", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(31002, "App Simple", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(31003, "App Simple Blue", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(31004, "Company", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(31005, "Company Image", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(31006, "Company Card", -1, true, MenuType.SUB_HEADER));
        items.add(new MainMenuAdapter.ListItem(31007, "Dialog Main Action", -1, true, MenuType.SUB_HEADER));

        items.add(new MainMenuAdapter.ListItem(-1, "Application", -1, MenuType.DIVIDER));
        items.add(new MainMenuAdapter.ListItem(1, "About", R.drawable.ic_error_outline, MenuType.NORMAL));

        return items;
    }

    @Override
    public void onBackPressed() {
        doExitApp();
    }

    private long exitTime = 0;

    public void doExitApp() {
        if ((System.currentTimeMillis() - exitTime) > 2000) {
            Toast.makeText(this, "Press again to exit app", Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        } else {
            finish();
        }
    }

    private void showDialogAbout() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); // before
        dialog.setContentView(R.layout.dialog_about);
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;

        ((TextView) dialog.findViewById(R.id.tv_version)).setText("Version " + BuildConfig.VERSION_NAME);

        ((View) dialog.findViewById(R.id.bt_getcode)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://codecanyon.net/user/dream_space/portfolio"));
                startActivity(i);
            }
        });

        ((ImageButton) dialog.findViewById(R.id.bt_close)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        ((Button) dialog.findViewById(R.id.bt_rate)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Tools.rateAction(MainMenu2.this);
            }
        });

        sharedPref.setFirstLaunch(false);
        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }

    private void showDialogOffer() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE); // before
        dialog.setContentView(R.layout.dialog_offer);
        dialog.setCancelable(true);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;

        ((View) dialog.findViewById(R.id.bt_getcode)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://codecanyon.net/user/dream_space/portfolio"));
                startActivity(i);
            }
        });

        sharedPref.setFirstLaunch(false);
        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }

}
