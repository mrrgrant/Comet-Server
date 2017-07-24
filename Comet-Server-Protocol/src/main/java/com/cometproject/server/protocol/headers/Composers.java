package com.cometproject.server.protocol.headers;


import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;


public class Composers {
    public static final short WiredRewardMessageComposer = 753;
    public static final short HeightMapMessageComposer = 3546;
    public static final short CallForHelpPendingCallsMessageComposer = 771;
    public static final short ChatMessageComposer = 82;
    public static final short GroupMembersMessageComposer = 3762;
    public static final short OpenBotActionMessageComposer = 2208;
    public static final short UserObjectMessageComposer = 1500;
    public static final short ActionMessageComposer = 449;
    public static final short ManageGroupMessageComposer = 2739;
    public static final short FloodControlMessageComposer = 2438;
    public static final short FlatControllerAddedMessageComposer = 1764;
    public static final short TradingClosedMessageComposer = 733;
    public static final short FlatCreatedMessageComposer = 3273;
    public static final short ScrSendUserInfoMessageComposer = 827;
    public static final short CheckPetNameMessageComposer = 632;
    public static final short QuestAbortedMessageComposer = 1918;
    public static final short RespectPetNotificationMessageComposer = 310;
    public static final short PromotableRoomsMessageComposer = 187;
    public static final short CloseConnectionMessageComposer = 3326;
    public static final short CfhTopicsInitMessageComposer = 2761;
    public static final short WiredEffectConfigMessageComposer = 2617;
    public static final short FriendListUpdateMessageComposer = 275;
    public static final short ObjectAddMessageComposer = 2362;
    public static final short NavigatorCollapsedCategoriesMessageComposer = 3045;
    public static final short RoomRightsListMessageComposer = 3260;
    public static final short TradingUpdateMessageComposer = 1958;
    public static final short CarryObjectMessageComposer = 3618;
    public static final short NewGroupInfoMessageComposer = 1893;
    public static final short RoomForwardMessageComposer = 2465;
    public static final short GroupFurniSettingsMessageComposer = 363;
    public static final short CreditBalanceMessageComposer = 1502;
    public static final short CatalogUpdatedMessageComposer = 1733;
    public static final short UserTypingMessageComposer = 3773;
    public static final short ObjectRemoveMessageComposer = 2278;
    public static final short RoomEntryInfoMessageComposer = 1034;
    public static final short CatalogOfferMessageComposer = 3782;
    public static final short CatalogIndexMessageComposer = 1113;
    public static final short ThreadsListDataMessageComposer = 2053;
    public static final short GroupFurniConfigMessageComposer = 1255;
    public static final short HabboUserBadgesMessageComposer = 1132;
    public static final short FlatAccessibleMessageComposer = 1989;
    public static final short ModeratorInitMessageComposer = 1335;
    public static final short FloorPlanSendDoorMessageComposer = 2541;
    public static final short SleepMessageComposer = 272;
    public static final short FlatControllerRemovedMessageComposer = 3036;
    public static final short UniqueMachineIDMessageComposer = 1303;
    public static final short ItemAddMessageComposer = 3525;
    public static final short GroupForumDataMessageComposer = 1703;
    public static final short UpdateFreezeLivesMessageComposer = 3543;
    public static final short NavigatorSettingsMessageComposer = 2722;
    public static final short ItemUpdateMessageComposer = 3635;
    public static final short AchievementsMessageComposer = 2419;
    public static final short LatencyResponseMessageComposer = 1991;
    public static final short RoomReadyMessageComposer = 525;
    public static final short HabboActivityPointNotificationMessageComposer = 3295;
    public static final short BuddyListMessageComposer = 2391;
    public static final short YoutubeDisplayPlaylistsMessageComposer = 2096;
    public static final short TradingCompleteMessageComposer = 629;
    public static final short PetInformationMessageComposer = 1888;
    public static final short ModeratorRoomChatlogMessageComposer = 1469;
    public static final short MOTDNotificationMessageComposer = 2442;
    public static final short GroupInfoMessageComposer = 3336;
    public static final short SlideObjectBundleMessageComposer = 342;
    public static final short FurniListRemoveMessageComposer = 3735;
    public static final short FurniListNotificationMessageComposer = 3879;
    public static final short RoomInfoUpdatedMessageComposer = 1380;
    public static final short AvatarEffectMessageComposer = 3856;
    public static final short OpenConnectionMessageComposer = 3374;
    public static final short FurniListMessageComposer = 372;
    public static final short PostUpdatedMessageComposer = 1998;
    public static final short UserFlatCatsMessageComposer = 2372;
    public static final short ObjectUpdateMessageComposer = 2155;
    public static final short ThreadUpdatedMessageComposer = 3749;
    public static final short HabboSearchResultMessageComposer = 3659;
    public static final short RespectNotificationMessageComposer = 2214;
    public static final short PetHorseFigureInformationMessageComposer = 2798;
    public static final short MessengerInitMessageComposer = 2195;
    public static final short ModeratorUserInfoMessageComposer = 3261;
    public static final short YouAreControllerMessageComposer = 2345;
    public static final short RoomRatingMessageComposer = 1758;
    public static final short RefreshFavouriteGroupMessageComposer = 3125;
    public static final short AvailabilityStatusMessageComposer = 1694;
    public static final short AchievementUnlockedMessageComposer = 3032;
    public static final short FlatAccessDeniedMessageComposer = 1370;
    public static final short NavigatorFlatCatsMessageComposer = 501;
    public static final short UsersMessageComposer = 2206;
    public static final short SecretKeyMessageComposer = 1092;
    public static final short TradingStartMessageComposer = 1539;
    public static final short RoomSettingsDataMessageComposer = 598;
    public static final short NewBuddyRequestMessageComposer = 128;
    public static final short DoorbellMessageComposer = 1478;
    public static final short OpenGiftMessageComposer = 3424;
    public static final short CantConnectMessageComposer = 3;
    public static final short FloorHeightMapMessageComposer = 2000;
    public static final short SellablePetBreedsMessageComposer = 3471;
    public static final short AchievementScoreMessageComposer = 562;
    public static final short BuildersClubMembershipMessageComposer = 2443;
    public static final short PetTrainingPanelMessageComposer = 3729;
    public static final short QuestCompletedMessageComposer = 715;
    public static final short UserRightsMessageComposer = 2494;
    public static final short ForumsListDataMessageComposer = 835;
    public static final short UserChangeMessageComposer = 901;
    public static final short ModeratorUserChatlogMessageComposer = 1660;
    public static final short GiftWrappingConfigurationMessageComposer = 2289;
    public static final short FloorPlanFloorMapMessageComposer = 3600;
    public static final short ThreadReplyMessageComposer = 423;
    public static final short GroupCreationWindowMessageComposer = 1224;
    public static final short GetGuestRoomResultMessageComposer = 2475;
    public static final short RoomNotificationMessageComposer = 2591;
    public static final short InitCryptoMessageComposer = 3115;
    public static final short SoundSettingsMessageComposer = 1797;
    public static final short WiredTriggerConfigMessageComposer = 3654;
    public static final short ItemsMessageComposer = 3549;
    public static final short PurchaseOKMessageComposer = 2185;
    public static final short BadgeEditorPartsMessageComposer = 2652;
    public static final short NewConsoleMessageMessageComposer = 1672;
    public static final short HideWiredConfigMessageComposer = 1646;
    public static final short CatalogPageMessageComposer = 3128;
    public static final short AddExperiencePointsMessageComposer = 2894;
    public static final short AvatarEffectsMessageComposer = 2790;
    public static final short QuestListMessageComposer = 1401;
    public static final short UnbanUserFromRoomMessageComposer = 280;
    public static final short WiredConditionConfigMessageComposer = 1045;
    public static final short StickyNoteMessageComposer = 1488;
    public static final short SanctionStatusMessageComposer = 3894;
    public static final short ObjectsMessageComposer = 974;
    public static final short RoomVisualizationSettingsMessageComposer = 2884;
    public static final short PromoArticlesMessageComposer = 3113;
    public static final short MaintenanceStatusMessageComposer = 3148;
    public static final short BuddyRequestsMessageComposer = 3951;
    public static final short AuthenticationOKMessageComposer = 223;
    public static final short QuestStartedMessageComposer = 1375;
    public static final short BotInventoryMessageComposer = 3035;
    public static final short PerkAllowancesMessageComposer = 1699;
    public static final short RoomEventMessageComposer = 3073;
    public static final short RoomMuteSettingsMessageComposer = 3597;
    public static final short ModeratorSupportTicketResponseMessageComposer = 1403;
    public static final short YouTubeDisplayVideoMessageComposer = 3280;
    public static final short RoomPropertyMessageComposer = 3357;
    public static final short ModeratorSupportTicketMessageComposer = 2871;
    public static final short RoomInviteMessageComposer = 869;
    public static final short FurniListUpdateMessageComposer = 909;
    public static final short BadgesMessageComposer = 2084;
    public static final short NavigatorSearchResultSetMessageComposer = 3094;
    public static final short IgnoreStatusMessageComposer = 2996;
    public static final short ShoutMessageComposer = 2945;
    public static final short MoodlightConfigMessageComposer = 1605;
    public static final short FurnitureAliasesMessageComposer = 3274;
    public static final short LoveLockDialogueCloseMessageComposer = 1664;
    public static final short TradingErrorMessageComposer = 3904;
    public static final short ProfileInformationMessageComposer = 698;
    public static final short ModeratorRoomInfoMessageComposer = 465;
    public static final short CampaignMessageComposer = 582;
    public static final short LoveLockDialogueMessageComposer = 1391;
    public static final short PurchaseErrorMessageComposer = 3149;
    public static final short PopularRoomTagsResultMessageComposer = 3446;
    public static final short GiftWrappingErrorMessageComposer = 3538;
    public static final short WhisperMessageComposer = 385;
    public static final short CatalogItemDiscountMessageComposer = 1182;
    public static final short HabboGroupBadgesMessageComposer = 1139;
    public static final short CanCreateRoomMessageComposer = 670;
    public static final short ThreadDataMessageComposer = 2375;
    public static final short TradingFinishMessageComposer = 2174;
    public static final short DanceMessageComposer = 3755;
    public static final short GenericErrorMessageComposer = 2501;
    public static final short NavigatorPreferencesMessageComposer = 1075;
    public static final short MutedMessageComposer = 1983;
    public static final short BroadcastMessageAlertMessageComposer = 1069;
    public static final short YouAreOwnerMessageComposer = 3596;
    public static final short ModeratorTicketChatlogMessageComposer = 898;
    public static final short BadgeDefinitionsMessageComposer = 461;
    public static final short UserRemoveMessageComposer = 3096;
    public static final short RoomSettingsSavedMessageComposer = 368;
    public static final short ModeratorUserRoomVisitsMessageComposer = 3082;
    public static final short NavigatorLiftedRoomsMessageComposer = 3345;
    public static final short NavigatorMetaDataParserMessageComposer = 1096;
    public static final short GetRelationshipsMessageComposer = 321;
    public static final short ItemRemoveMessageComposer = 3957;
    public static final short ThreadCreatedMessageComposer = 2650;
    public static final short EnforceCategoryUpdateMessageComposer = 1120;
    public static final short AchievementProgressedMessageComposer = 1970;
    public static final short ActivityPointsMessageComposer = 873;
    public static final short PetInventoryMessageComposer = 3513;
    public static final short GetRoomBannedUsersMessageComposer = 292;
    public static final short UserUpdateMessageComposer = 1491;
    public static final short FavouritesMessageComposer = 3973;
    public static final short WardrobeMessageComposer = 344;
    public static final short LoveLockDialogueSetLockedMessageComposer = 1664;
    public static final short TradingAcceptMessageComposer = 2229;
    public static final short SongInventoryMessageComposer = 527;
    public static final short SongIdMessageComposer = 1414;
    public static final short SongDataMessageComposer = 2341;
    public static final short PlaylistMessageComposer = 1211;
    public static final short PlayMusicMessageComposer = 1366;
    public static final short QuickPollMessageComposer = 814;
    public static final short QuickPollResultMessageComposer = 2293;
    public static final short QuickPollResultsMessageComposer = 3242;
    public static final short InitializePollMessageComposer = 1816;
    public static final short PollMessageComposer = 2401;
    public static final short AvatarAspectUpdateMessageComposer = 2407;
    public static final short YouAreSpectatorMessageComposer = 3365;
    public static final short UpdateStackMapMessageComposer = 2555;
    public static final short CameraPhotoPreviewMessageComposer = 555;
    public static final short CameraBuyPhotoMessageComposer = 1492;
    public static final short CameraPriceMessageComposer = 3328;
    public static final short UpdateUsernameMessageComposer = 112;
    public static final short UserNameChangeMessageComposer = 607;
    public static final short NameChangeUpdateMessageComposer = 928;
    public static final short SendHotelViewLooksMessageComposer = 3275;
    public static final short GuideSessionAttachedMessageComposer = 2686;
    public static final short GuideSessionDetachedMessageComposer = 2130;
    public static final short GuideSessionStartedMessageComposer = 1818;
    public static final short GuideSessionEndedMessageComposer = 3133;
    public static final short GuideSessionErrorMessageComposer = 2404;
    public static final short GuideSessionMessageMessageComposer = 2402;
    public static final short GuideSessionRequesterRoomMessageComposer = 3906;
    public static final short GuideSessionInvitedToGuideRoomMessageComposer = 24;
    public static final short GuideSessionPartnerIsTypingMessageComposer = 2781;
    public static final short GuideToolsMessageComposer = 422;
    public static final short GuardianNewReportReceivedMessageComposer = 1001;
    public static final short GuardianVotingRequestedMessageComposer = 3075;
    public static final short GuardianVotingVotesMessageComposer = 2449;
    public static final short GuardianVotingResultMessageComposer = 847;
    public static final short GuardianVotingTimeEndedMessageComposer = 238;
    public static final short ModToolReportReceivedAlertMessageComposer = 2604;
    public static final short BullyReportClosedMessageComposer = 1259;
    public static final short BullyReportRequestMessageComposer = 3711;
    public static final short BullyReportedMessageMessageComposer = 1416;
    public static final short HelperRequestDisabledMessageComposer = 2975;
    public static final short UserTagsMessageComposer = 397;
    public static final short GetRoomFilterListMessageComposer = 2297;
    public static final short NavigatorSavedSearchesMessageComposer = 2017;
    public static final short FindFriendsProcessResultMessageComposer = 3682;
    public static final short NavigatorFavoritedRoomMessageComposer = 1723;
    public static final short FollowErrorMessageComposer = 2054;
    public static final short FriendRequestErrorMessageComposer = 75;
    public static final short BotErrorMessageComposer = 2469;
    public static final short PetErrorMessageComposer = 1819;
    public static final short GroupAcceptMemberErrorMessageComposer = 2398;
    public static final short RemoveGroupFromRoomMessageComposer = 274;
    public static final short RefreshGroupMembersListMessageComposer = 1775;
    public static final short GroupMemberUpdateMessageComposer = 1740;
    public static final short GroupConfirmRemoveMemberMessageComposer = 3992;
    public static final short RemoveBotMessageComposer = 499;
    public static final short ReceivedHandItemMessageComposer = 3496;
    public static final short LimitedEditionSoldOutMessageComposer = 3847;
    public static final short LoveLockDialogueFinishedMessageComposer = 3449;
    public static final short RoomChatSettingsMessageComposer = 2784;
    public static final short AddBotMessageComposer = 1485;
    public static final short PurchaseUnavailableErrorMessageComposer = 3463;
    public static final short GroupFavoritePlayerUpdateMessageComposer = 3669;
    public static final short JoinGroupErrorMessageComposer = 1186;
    public static final short RoomActionMessageComposer = 2283;
    public static final short PetBreedingMessageComposer = 1561;
    public static final short PetBreedingCompleteMessageComposer = 208;
    public static final short PetBreedingStartedMessageComposer = 713;
    public static final short PetPackageMessageComposer = 3418;
    public static final short PetPackageOpenedMessageComposer = 251;

    private static Map<Short, String> composerPacketNames = new HashMap<>();

    static {
        try {
            for (Field field : Composers.class.getDeclaredFields()) {
                if (!Modifier.isPrivate(field.getModifiers()))
                    composerPacketNames.put(field.getShort(field.getName()), field.getName());
            }
        } catch (Exception ignored) {

        }
    }

    public static String valueOfId(short packetId) {
        if (composerPacketNames.containsKey(packetId)) {
            return composerPacketNames.get(packetId);
        }

        return "UnknownMessageComposer";
    }
}
