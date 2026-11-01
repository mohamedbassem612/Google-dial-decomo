package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ajhk {
    public static final defpackage.ajmk a = new defpackage.ajmk(defpackage.ajhf.class, new defpackage.ajhg(0));
    public static final defpackage.ajmk b = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", new defpackage.ajhh(0));
    public static final defpackage.ajmk c = new defpackage.ajmk(defpackage.ajhc.class, new defpackage.ajhi(0));
    public static final defpackage.ajmk d = new defpackage.ajmk("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", new defpackage.ajhj(0));

    public static defpackage.ajfe a(ajhe ajheVar) throws java.security.GeneralSecurityException {
        if (ajhe.a.equals(ajheVar)) {
            return defpackage.ajfe.b;
        }
        if (ajhe.b.equals(ajheVar)) {
            return defpackage.ajfe.d;
        }
        throw new java.security.GeneralSecurityException("Unable to serialize variant: ".concat(ajheVar.c));
    }

    public static defpackage.ajhf b(ajqh ajqhVar, defpackage.ajfe ajfeVar) throws java.security.GeneralSecurityException {
        ajhd ajhdVar;
        ajhe ajheVar;
        try {
            ajpz ajpzVar = ajpz.a;
            defpackage.akzx akzxVarM = ajpzVar.m();
            ajpz ajpzVar2 = ajqhVar.d;
            if (ajpzVar2 == null) {
                ajpzVar2 = ajpzVar;
            }
            java.lang.String str = ajpzVar2.b;
            akzxVarM.u();
            ajpz ajpzVar3 = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            ajpzVar3.b = str;
            ajpz ajpzVar4 = ajqhVar.d;
            if (ajpzVar4 != null) {
                ajpzVar = ajpzVar4;
            }
            defpackage.akzc akzcVar = ajpzVar.c;
            akzxVarM.u();
            ajpz ajpzVar5 = akzxVarM.b;
            j$.util.Objects.requireNonNull(akzcVar);
            ajpzVar5.c = akzcVar;
            akzxVarM.u();
            akzxVarM.b.d = defpackage.a.S(5);
            defpackage.ajsz ajszVarF = ajee.f(akzxVarM.r().i(), ajft.a);
            boolean z = ajszVarF instanceof defpackage.ajgm;
            if (z) {
                ajhdVar = ajhd.a;
            } else if (ajszVarF instanceof defpackage.ajgu) {
                ajhdVar = ajhd.c;
            } else if (ajszVarF instanceof defpackage.ajhu) {
                ajhdVar = ajhd.b;
            } else if (ajszVarF instanceof defpackage.ajgc) {
                ajhdVar = ajhd.d;
            } else if (ajszVarF instanceof defpackage.ajgh) {
                ajhdVar = ajhd.e;
            } else {
                if (!(ajszVarF instanceof defpackage.ajgq)) {
                    throw new java.security.GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(ajszVarF.toString()));
                }
                ajhdVar = ajhd.f;
            }
            if (ajfeVar.equals(defpackage.ajfe.b)) {
                ajheVar = ajhe.a;
            } else {
                if (!ajfeVar.equals(defpackage.ajfe.d)) {
                    throw new java.security.GeneralSecurityException("Unable to parse OutputPrefixType: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajfeVar))));
                }
                ajheVar = ajhe.b;
            }
            java.lang.String str2 = ajqhVar.c;
            if (str2 == null) {
                throw new java.security.GeneralSecurityException("kekUri must be set");
            }
            if (ajszVarF.dU()) {
                throw new java.security.GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            if ((ajhdVar.equals(ajhd.a) && z) || ((ajhdVar.equals(ajhd.c) && (ajszVarF instanceof defpackage.ajgu)) || ((ajhdVar.equals(ajhd.b) && (ajszVarF instanceof defpackage.ajhu)) || ((ajhdVar.equals(ajhd.d) && (ajszVarF instanceof defpackage.ajgc)) || ((ajhdVar.equals(ajhd.e) && (ajszVarF instanceof defpackage.ajgh)) || (ajhdVar.equals(ajhd.f) && (ajszVarF instanceof defpackage.ajgq))))))) {
                return new defpackage.ajhf(ajheVar, str2, ajhdVar, ajszVarF);
            }
            throw new java.security.GeneralSecurityException("Cannot use parsing strategy " + ajhdVar.g + " when new keys are picked according to " + ajszVarF.toString() + '.');
        } catch (java.security.GeneralSecurityException e) {
            ajpz ajpzVar6 = ajqhVar.d;
            if (ajpzVar6 == null) {
                ajpzVar6 = ajpz.a;
            }
            throw new java.security.GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ajpzVar6))), e);
        }
    }

    public static ajqh c(defpackage.ajhf ajhfVar) {
        try {
            ajpz ajpzVarB = defpackage.alad.B(ajpz.a, ajee.g(ajhfVar.c, ajft.a), defpackage.akzq.a);
            defpackage.akzx akzxVarM = ajqh.a.m();
            java.lang.String str = ajhfVar.b;
            akzxVarM.u();
            ajqh ajqhVar = akzxVarM.b;
            j$.util.Objects.requireNonNull(str);
            ajqhVar.c = str;
            akzxVarM.u();
            ajqh ajqhVar2 = akzxVarM.b;
            j$.util.Objects.requireNonNull(ajpzVarB);
            ajqhVar2.d = ajpzVarB;
            ajqhVar2.b |= 1;
            return akzxVarM.r();
        } catch (defpackage.alaz e) {
            throw new java.security.GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }
}
