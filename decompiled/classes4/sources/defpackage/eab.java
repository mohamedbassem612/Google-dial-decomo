package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class eab {
    public final dwn a;
    public final dwn b;

    public eab(android.view.WindowInsetsAnimation.Bounds bounds) {
        this.a = dwn.e(bounds.getLowerBound());
        this.b = dwn.e(bounds.getUpperBound());
    }

    public final java.lang.String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + '}';
    }

    public eab(dwn dwnVar, dwn dwnVar2) {
        this.a = dwnVar;
        this.b = dwnVar2;
    }
}
