package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class lva {
    public final long a;
    public final android.net.Uri b;
    public final boolean c = true;

    public lva(long j, android.net.Uri uri) {
        this.a = j;
        this.b = uri;
    }

    public final java.lang.Object a() {
        android.net.Uri uri = this.b;
        return uri == null ? java.lang.Long.valueOf(this.a) : uri;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public final void b(android.widget.ImageView imageView) {
        defpackage.lut lutVar;
        aimz aimzVar = defpackage.luu.a;
        android.net.Uri uri = this.b;
        if (uri != null) {
            java.lang.String encodedFragment = uri.getEncodedFragment();
            if (android.text.TextUtils.isEmpty(encodedFragment) || !encodedFragment.equals("2")) {
                lutVar = defpackage.lut.a;
            } else {
                lutVar = defpackage.lut.b;
            }
        } else {
            lutVar = defpackage.lut.a;
        }
        mni.bV(imageView, lutVar);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.lva lvaVar = (defpackage.lva) obj;
            if (this.a == lvaVar.a && wsc.aR(this.b, lvaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        android.net.Uri uri = this.b;
        int iHashCode = uri == null ? 0 : uri.hashCode();
        long j = this.a;
        return ((((((int) (j ^ (j >>> 32))) + 31) * 31) - 1) * 31) + iHashCode;
    }
}
