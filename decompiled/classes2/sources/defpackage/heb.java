package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class heb implements defpackage.hdo {
    public final java.lang.String a;
    public final defpackage.hdh b;
    public final boolean c;
    private final int d;

    public heb(java.lang.String str, int i, defpackage.hdh hdhVar, boolean z) {
        this.a = str;
        this.d = i;
        this.b = hdhVar;
        this.c = z;
    }

    @Override // defpackage.hdo
    public final defpackage.hag a(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar) {
        return new defpackage.hav(gzsVar, hefVar, this);
    }

    public final java.lang.String toString() {
        return "ShapePath{name=" + this.a + ", index=" + this.d + '}';
    }
}
