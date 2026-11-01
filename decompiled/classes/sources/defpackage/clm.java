package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class clm extends defpackage.clt {
    public defpackage.chm a;
    public int b;
    public int c;

    public clm(long j, defpackage.chm chmVar) {
        super(j);
        this.a = chmVar;
    }

    @Override // defpackage.clt
    public final defpackage.clt b(long j) {
        return new defpackage.clm(j, this.a);
    }

    @Override // defpackage.clt
    public final void c(defpackage.clt cltVar) {
        synchronized (defpackage.cle.a) {
            defpackage.aooh.d(cltVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.StateListStateRecord>");
            defpackage.clm clmVar = (defpackage.clm) cltVar;
            this.a = clmVar.a;
            this.b = clmVar.b;
            this.c = clmVar.c;
        }
    }
}
