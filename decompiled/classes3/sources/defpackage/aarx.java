package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aarx extends defpackage.aart {
    private final aaec a;

    public aarx(aaec aaecVar) {
        this.a = aaecVar;
    }

    @Override // defpackage.aart
    public final void c(int i, android.os.Bundle bundle, android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.Bundle bundle2) {
        com.google.android.gms.common.api.Status statusO = defpackage.aasa.O(i, bundle);
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            bundle2.getInt("width");
            bundle2.getInt("height");
        }
        this.a.c(new defpackage.aarz(statusO, parcelFileDescriptor));
    }
}
