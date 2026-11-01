package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uyo implements znb {
    private static final aimz a = aimz.i("com/android/dialer/videohandoverdialog/impl/service/VideoHandoverDialogHandoverListener");
    private final defpackage.voc b;

    public uyo(defpackage.voc vocVar) {
        this.b = vocVar;
    }

    public final void a(java.lang.String str, android.os.Bundle bundle) {
        a.b().l("com/android/dialer/videohandoverdialog/impl/service/VideoHandoverDialogHandoverListener", "onConnectionEvent", 32, "VideoHandoverDialogHandoverListener.java").y("event: %s", str);
        int iHashCode = str.hashCode();
        if (iHashCode == -1652183308) {
            if (str.equals("android.telephony.event.EVENT_HANDOVER_VIDEO_FROM_LTE_TO_WIFI")) {
                this.b.a(defpackage.uyp.LTE_TO_WIFI);
            }
        } else if (iHashCode == 1673445297) {
            if (str.equals("android.telephony.event.EVENT_HANDOVER_TO_WIFI_FAILED")) {
                this.b.a(defpackage.uyp.LTE_TO_WIFI_FAILED);
            }
        } else if (iHashCode == 2024477568 && str.equals("android.telephony.event.EVENT_HANDOVER_VIDEO_FROM_WIFI_TO_LTE")) {
            this.b.a(defpackage.uyp.WIFI_TO_LTE);
        }
    }
}
