package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kvy {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/callrecording/impl/dataservice/CrosbySettingsDataService");
    public final android.content.Context b;
    public final defpackage.kwe c;
    public final defpackage.sqn d;
    public final defpackage.zjx e;
    public final defpackage.ajct f;
    public final defpackage.lbi g;
    public final defpackage.kvw h;
    public final defpackage.gou i;
    public final defpackage.kaw j;
    public final defpackage.ahbv k;
    public final defpackage.aogc l;
    public final defpackage.agab m;
    public final defpackage.aogc n;

    public kvy(android.content.Context context, defpackage.kaw kawVar, defpackage.kwe kweVar, defpackage.aogc aogcVar, defpackage.sqn sqnVar, defpackage.ahbv ahbvVar, defpackage.agab agabVar, defpackage.aogc aogcVar2, defpackage.zjx zjxVar, defpackage.ajct ajctVar, defpackage.lbi lbiVar, defpackage.kvw kvwVar, defpackage.gou gouVar) {
        this.b = context;
        this.j = kawVar;
        this.c = kweVar;
        this.n = aogcVar;
        this.d = sqnVar;
        this.k = ahbvVar;
        this.m = agabVar;
        this.l = aogcVar2;
        this.e = zjxVar;
        this.f = ajctVar;
        this.g = lbiVar;
        this.h = kvwVar;
        this.i = gouVar;
    }

    public final defpackage.ajcq a() {
        defpackage.ahrv ahrvVarG = defpackage.ahrv.g(this.n.aW());
        kvd kvdVar = new kvd(this, 7);
        defpackage.ajct ajctVar = this.f;
        defpackage.ahrv ahrvVarI = ahrvVarG.i(kvdVar, ajctVar).i(new kvd(this, 8), ajctVar);
        this.l.s(ahrvVarI, kzj.a);
        return ahrvVarI;
    }

    public final defpackage.ajcq b(kwx kwxVar) {
        defpackage.jsd jsdVar = new defpackage.jsd(defpackage.ahqx.a(new jss(kwxVar, 19)), 9);
        defpackage.aogc aogcVar = this.n;
        defpackage.ajcq ajcqVarP = ((defpackage.kaw) aogcVar.c).p(((defpackage.aogc) aogcVar.b).bl(jsdVar));
        this.l.s(ajcqVarP, kzj.a);
        return ajcqVarP;
    }

    public final defpackage.ajcq c(kun kunVar) {
        defpackage.aogc aogcVar = this.n;
        defpackage.aogc aogcVar2 = this.l;
        defpackage.ajcq ajcqVarBa = aogcVar.ba(kunVar);
        aogcVar2.s(ajcqVarBa, kzj.a);
        return ajcqVarBa;
    }

    public final defpackage.ajcq d(boolean z) {
        defpackage.jsd jsdVar = new defpackage.jsd(defpackage.ahqx.a(new kxa(z, 0)), 9);
        defpackage.aogc aogcVar = this.n;
        defpackage.ahrv ahrvVarI = defpackage.ahrv.g(((defpackage.kaw) aogcVar.c).p(((defpackage.aogc) aogcVar.b).bl(jsdVar))).i(new kvd(this, 3), this.f);
        this.l.s(ahrvVarI, kzj.a);
        return ahrvVarI;
    }
}
