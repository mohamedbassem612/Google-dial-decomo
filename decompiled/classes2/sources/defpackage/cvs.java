package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class cvs implements cmu {
    public aonj a;
    public defpackage.cvw b;
    public boolean d;
    public final defpackage.cvp e = new defpackage.cvp(this);

    public final /* synthetic */ cmw a(cmw cmwVar) {
        return cmwVar != cmw.c ? new cmq(this, cmwVar) : this;
    }

    public final /* synthetic */ java.lang.Object b(java.lang.Object obj, aonn aonnVar) {
        return aonnVar.a(obj, this);
    }

    public final /* synthetic */ boolean c(aonj aonjVar) {
        return ((java.lang.Boolean) aonjVar.a(this)).booleanValue();
    }

    public final aonj d() {
        aonj aonjVar = this.a;
        if (aonjVar != null) {
            return aonjVar;
        }
        aooh.j("onTouchEvent");
        return null;
    }
}
