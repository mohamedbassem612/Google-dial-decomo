package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jve implements agxi {
    public static final akzm a = aldf.f(3, 0);
    public static final agxj b = new agxj("CALLER_TAG_SELECTOR_DATA_SOURCE");
    public final zjm c;
    public final kaw d;
    public final aogc e;
    private final defpackage.jrz f;
    private final ajct g;

    public jve(defpackage.jrz jrzVar, aogc aogcVar, zjm zjmVar, ajct ajctVar, kaw kawVar) {
        this.f = jrzVar;
        this.e = aogcVar;
        this.c = zjmVar;
        this.g = ajctVar;
        this.d = kawVar;
    }

    public final ajbg a() {
        return new ajbg(ahrv.g(this.e.bk()).h(new defpackage.jvq(1), this.g));
    }

    public final ajcq b() {
        akzx akzxVarM = defpackage.jvm.a.m();
        defpackage.kiw kiwVar = this.f.d;
        if (kiwVar == null) {
            kiwVar = defpackage.kiw.a;
        }
        aify aifyVarN = aify.n(kiwVar.v);
        ahrv ahrvVarG = ahrv.g(this.e.bk());
        char[] cArr = null;
        defpackage.juo juoVar = new defpackage.juo(this, akzxVarM, aifyVarN, 4, cArr);
        ajct ajctVar = this.g;
        return ahrvVarG.i(juoVar, ajctVar).i(new defpackage.juo(this, akzxVarM, aifyVarN, 5, cArr), ajctVar).i(new defpackage.idd(this, akzxVarM, 15), ajctVar).i(new defpackage.idd(this, akzxVarM, 16), ajctVar);
    }

    public final /* synthetic */ java.lang.Object e() {
        return b;
    }
}
