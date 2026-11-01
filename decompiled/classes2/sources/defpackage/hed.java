package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hed implements defpackage.hdo {
    public final defpackage.hdb a;
    public final defpackage.hdb b;
    public final defpackage.hdb c;
    public final boolean d;
    public final int e;

    public hed(int i, defpackage.hdb hdbVar, defpackage.hdb hdbVar2, defpackage.hdb hdbVar3, boolean z) {
        this.e = i;
        this.a = hdbVar;
        this.b = hdbVar2;
        this.c = hdbVar3;
        this.d = z;
    }

    @Override // defpackage.hdo
    public final defpackage.hag a(defpackage.gzs gzsVar, defpackage.gzh gzhVar, defpackage.hef hefVar) {
        return new defpackage.hax(hefVar, this);
    }

    public final java.lang.String toString() {
        defpackage.hdb hdbVar = this.c;
        defpackage.hdb hdbVar2 = this.b;
        return "Trim Path: {start: " + java.lang.String.valueOf(this.a) + ", end: " + java.lang.String.valueOf(hdbVar2) + ", offset: " + java.lang.String.valueOf(hdbVar) + '}';
    }
}
