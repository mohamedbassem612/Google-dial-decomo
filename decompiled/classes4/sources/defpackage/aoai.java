package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aoai implements java.lang.Runnable {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    public aoai(defpackage.anut anutVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(anutVar);
        this.a = anutVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj = this.a;
            defpackage.aoap aoapVar = (defpackage.aoap) obj;
            aoapVar.s = null;
            aoapVar.k.c();
            ((defpackage.anon) obj).c();
            return;
        }
        if (i == 1) {
            ((defpackage.anut) this.a).f.h(anzg.d);
            return;
        }
        java.lang.Object obj2 = this.a;
        if (i != 2) {
            ((defpackage.anon) obj2).c();
            return;
        }
        defpackage.aoap aoapVar2 = (defpackage.aoap) obj2;
        aoapVar2.r = null;
        if (aoapVar2.k.e()) {
            ((defpackage.anon) obj2).c();
        }
    }

    public /* synthetic */ aoai(defpackage.aoap aoapVar, int i, char[] cArr) {
        this.$cid = i;
        this.a = aoapVar;
    }

    public aoai(defpackage.aoap aoapVar, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aoapVar);
        this.a = aoapVar;
    }

    public aoai(defpackage.aoap aoapVar, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(aoapVar);
        this.a = aoapVar;
    }
}
