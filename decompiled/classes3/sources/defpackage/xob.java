package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xob extends ylc implements defpackage.xoc {
    private final java.util.List a;
    private int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xob(defpackage.xpa xpaVar) {
        super("com.android.onboarding.tasks.service.IPersistableBundleStream");
        aooh.f(xpaVar, "persistable");
        android.os.PersistableBundle persistableBundle = xpaVar.toPersistableBundle();
        aooh.f(persistableBundle, "persistableBundle");
        java.util.List listJ = defpackage.xff.j(persistableBundle);
        this.a = listJ;
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        if (i != 2) {
            return false;
        }
        byte[] bArrA = a();
        parcel2.writeNoException();
        parcel2.writeByteArray(bArrA);
        return true;
    }

    @Override // defpackage.xoc
    public final byte[] a() {
        int i = this.b;
        this.b = i + 1;
        return (byte[]) ajsz.bH(this.a, i);
    }
}
