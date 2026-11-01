package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class udn {
    public static final udm a;

    static {
        defpackage.uzx uzxVarCc = wsc.cc(udm.a.m());
        uzxVarCc.l(udj.a);
        akzx akzxVar = (akzx) uzxVarCc.a;
        akzxVar.u();
        udm udmVar = akzxVar.b;
        udmVar.e = 0;
        udmVar.b |= 4;
        uzxVarCc.m(udk.a);
        a = uzxVarCc.k();
    }

    public static final boolean a(udm udmVar) {
        aooh.f(udmVar, "classification");
        udj udjVarB = udj.b(udmVar.d);
        if (udjVarB == null) {
            udjVarB = udj.a;
        }
        return udjVarB != udj.a;
    }

    public static final boolean b(j$.util.Optional optional) {
        aooh.f(optional, "classification");
        udm udmVar = (udm) aooh.q(optional);
        if (udmVar != null) {
            return a(udmVar);
        }
        return false;
    }

    public static final boolean c(udm udmVar) {
        udj udjVarB = udj.b(udmVar.d);
        if (udjVarB == null) {
            udjVarB = udj.a;
        }
        return udjVarB == udj.c;
    }
}
