package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoqi implements defpackage.aoql {
    public final defpackage.aoql a;
    public final boolean b;
    public final defpackage.aonj c;

    public aoqi(defpackage.aoql aoqlVar, boolean z, defpackage.aonj aonjVar) {
        if (aonjVar == null) {
            defpackage.aooh.i("predicate");
        }
        this.a = aoqlVar;
        this.b = z;
        this.c = aonjVar;
    }

    @Override // defpackage.aoql
    public final java.util.Iterator a() {
        return new defpackage.aoqh(this);
    }
}
