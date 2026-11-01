package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gec implements android.os.Parcelable.Creator {
    private final /* synthetic */ int $cid;

    public gec(int i) {
        this.$cid = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        com.android.dialer.patrick.onboarding.service.CameraUriState.Success onboardingSavedState;
        switch (this.$cid) {
            case 0:
                return new androidx.preference.ListPreference.SavedState(parcel);
            case 1:
                return new androidx.preference.EditTextPreference.SavedState(parcel);
            case 2:
                return new androidx.preference.MultiSelectListPreference.SavedState(parcel);
            case 3:
                return new androidx.preference.Preference.BaseSavedState(parcel);
            case 4:
                return new androidx.preference.PreferenceGroup.SavedState(parcel);
            case 5:
                return new androidx.preference.SeekBarPreference.SavedState(parcel);
            case 6:
                return new androidx.preference.TwoStatePreference.SavedState(parcel);
            case 7:
                return new androidx.versionedparcelable.ParcelImpl(parcel);
            case 8:
                return new com.airbnb.lottie.LottieAnimationView.SavedState(parcel);
            case 9:
                return new com.android.dialer.incall.rtt.ui.RttCheckableButton.SavedState(parcel);
            case 10:
                return new com.android.dialer.interactions.PhoneNumberInteraction.PhoneItem(parcel);
            case 11:
                aooh.f(parcel, "parcel");
                aooh.f(parcel, "parcel");
                byte[] bArrCreateByteArray = parcel.createByteArray();
                return new com.android.dialer.patrick.impl.service.CallingCardUiModel(bArrCreateByteArray != null ? (abxt) alad.y(abxt.a, bArrCreateByteArray) : null, parcel.readString(), parcel.readString());
            case 12:
                aooh.f(parcel, "parcel");
                onboardingSavedState = new com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState((android.net.Uri) parcel.readParcelable(com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState.class.getClassLoader()), java.lang.Enum.valueOf(sjg.class, parcel.readString()), snl.l(parcel), snl.l(parcel), java.lang.Enum.valueOf(sjj.class, parcel.readString()), java.lang.Enum.valueOf(sjk.class, parcel.readString()), parcel.readString(), parcel.readString());
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aooh.f(parcel, "parcel");
                parcel.readInt();
                return com.android.dialer.patrick.onboarding.service.CameraUriState.NoPermission.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aooh.f(parcel, "parcel");
                onboardingSavedState = new com.android.dialer.patrick.onboarding.service.CameraUriState.Success((android.net.Uri) parcel.readParcelable(com.android.dialer.patrick.onboarding.service.CameraUriState.Success.class.getClassLoader()));
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new com.android.dialer.timekeeper.histogram.HistogramView.SavedState(parcel);
            case 16:
                return new com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address(parcel);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aooh.f(parcel, "parcel");
                return new com.android.onboarding.config.OnboardingConfig(parcel.readInt() != 0 ? (com.android.onboarding.config.WaitingScreenConfig) com.android.onboarding.config.WaitingScreenConfig.CREATOR.createFromParcel(parcel) : null, parcel.readParcelable(com.android.onboarding.config.OnboardingConfig.class.getClassLoader()), parcel.readParcelable(com.android.onboarding.config.OnboardingConfig.class.getClassLoader()), parcel.readString());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aooh.f(parcel, "parcel");
                return new com.android.onboarding.config.WaitingScreenConfig(parcel.readString());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aooh.f(parcel, "parcel");
                return new com.android.onboarding.config.foregroundpriority.ForegroundPriority(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            default:
                aooh.f(parcel, "parcel");
                int i = parcel.readInt();
                java.util.ArrayList arrayList = new java.util.ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(com.android.onboarding.config.foregroundpriority.ForegroundPriority.CREATOR.createFromParcel(parcel));
                }
                return new com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig(arrayList);
        }
        return onboardingSavedState;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        switch (this.$cid) {
            case 0:
                return new androidx.preference.ListPreference.SavedState[i];
            case 1:
                return new androidx.preference.EditTextPreference.SavedState[i];
            case 2:
                return new androidx.preference.MultiSelectListPreference.SavedState[i];
            case 3:
                return new androidx.preference.Preference.BaseSavedState[i];
            case 4:
                return new androidx.preference.PreferenceGroup.SavedState[i];
            case 5:
                return new androidx.preference.SeekBarPreference.SavedState[i];
            case 6:
                return new androidx.preference.TwoStatePreference.SavedState[i];
            case 7:
                return new androidx.versionedparcelable.ParcelImpl[i];
            case 8:
                return new com.airbnb.lottie.LottieAnimationView.SavedState[i];
            case 9:
                return new com.android.dialer.incall.rtt.ui.RttCheckableButton.SavedState[i];
            case 10:
                return new com.android.dialer.interactions.PhoneNumberInteraction.PhoneItem[i];
            case 11:
                return new com.android.dialer.patrick.impl.service.CallingCardUiModel[i];
            case 12:
                return new com.android.dialer.patrick.navigation.viewmodel.OnboardingSavedState[i];
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new com.android.dialer.patrick.onboarding.service.CameraUriState.NoPermission[i];
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new com.android.dialer.patrick.onboarding.service.CameraUriState.Success[i];
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new com.android.dialer.timekeeper.histogram.HistogramView.SavedState[i];
            case 16:
                return new com.android.dialer.voicemail.service.impl.vvmclients.omtp.imap.mail.Address[i];
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new com.android.onboarding.config.OnboardingConfig[i];
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new com.android.onboarding.config.WaitingScreenConfig[i];
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new com.android.onboarding.config.foregroundpriority.ForegroundPriority[i];
            default:
                return new com.android.onboarding.config.foregroundpriority.ForegroundPriorityConfig[i];
        }
    }
}
