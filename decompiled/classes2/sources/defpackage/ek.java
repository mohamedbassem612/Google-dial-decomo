package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ek extends defpackage.er {
    final /* synthetic */ java.util.List a;
    final /* synthetic */ java.util.List b;

    public ek(java.util.List list, java.util.List list2) {
        this.a = list;
        this.b = list2;
    }

    @Override // defpackage.er
    public final int a() {
        return this.b.size();
    }

    @Override // defpackage.er
    public final int b() {
        return this.a.size();
    }

    @Override // defpackage.er
    public final java.lang.Object c(int i, int i2) {
        java.util.List list = this.b;
        java.lang.Object obj = this.a.get(i);
        java.lang.Object obj2 = list.get(i2);
        if (obj == null || obj2 == null) {
            throw new java.lang.AssertionError();
        }
        return null;
    }

    @Override // defpackage.er
    public final boolean d(int i, int i2) {
        java.util.List list = this.b;
        java.lang.Object obj = this.a.get(i);
        java.lang.Object obj2 = list.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                com.google.android.libraries.social.licenses.License license = (com.google.android.libraries.social.licenses.License) obj;
                com.google.android.libraries.social.licenses.License license2 = (com.google.android.libraries.social.licenses.License) obj2;
                return license.a.equals(license2.a) && license.b == license2.b && license.c == license2.c;
            }
        } else if (obj2 == null) {
            return true;
        }
        throw new java.lang.AssertionError();
    }

    @Override // defpackage.er
    public final boolean e(int i, int i2) {
        java.util.List list = this.b;
        java.lang.Object obj = this.a.get(i);
        java.lang.Object obj2 = list.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return ((com.google.android.libraries.social.licenses.License) obj).a.equals(((com.google.android.libraries.social.licenses.License) obj2).a);
            }
        } else if (obj2 == null) {
            return true;
        }
        return false;
    }
}
