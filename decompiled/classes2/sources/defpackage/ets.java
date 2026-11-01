package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ets extends android.telephony.TelephonyCallback implements android.telephony.TelephonyCallback.DisplayInfoListener {
    private final afpb a;

    public ets(afpb afpbVar) {
        this.a = afpbVar;
    }

    public final void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo telephonyDisplayInfo) {
        int iM = baa$.ExternalSyntheticApiModelOutline1.m(telephonyDisplayInfo);
        this.a.h(true == (iM == 3 || iM == 4 || iM == 5) ? 10 : 5);
    }
}
