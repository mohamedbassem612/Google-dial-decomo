package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aoru extends defpackage.aoue {
    public defpackage.aotj a;
    public final defpackage.aorq b = new defpackage.aorq(null, defpackage.aorr.a);
    final /* synthetic */ defpackage.apni c;
    private final defpackage.aosb g;

    public aoru(defpackage.apni apniVar, defpackage.aosb aosbVar) {
        this.c = apniVar;
        this.g = aosbVar;
    }

    @Override // defpackage.aoue
    public final void a(java.lang.Throwable th) {
        if (th != null) {
            defpackage.aosb aosbVar = this.g;
            defpackage.apcm apcmVarG = ((defpackage.aosc) aosbVar).G(new defpackage.aosk(th, false), null);
            if (apcmVarG != null) {
                aosbVar.c(apcmVarG);
                defpackage.aorv aorvVar = (defpackage.aorv) this.b.a;
                if (aorvVar != null) {
                    aorvVar.a();
                    return;
                }
                return;
            }
            return;
        }
        defpackage.apni apniVar = this.c;
        if (((defpackage.aoro) apniVar.a).a() == 0) {
            defpackage.aosb aosbVar2 = this.g;
            defpackage.aosy[] aosyVarArr = (defpackage.aosy[]) apniVar.b;
            java.util.ArrayList arrayList = new java.util.ArrayList(aosyVarArr.length);
            for (defpackage.aosy aosyVar : aosyVarArr) {
                arrayList.add(aosyVar.b());
            }
            aosbVar2.w(arrayList);
        }
    }

    @Override // defpackage.aoue
    public final boolean b() {
        return false;
    }
}
