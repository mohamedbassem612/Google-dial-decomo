package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajex {
    public final java.util.List a;
    public final java.util.Map b;
    private final defpackage.ajex c;

    public ajex(java.util.List list, java.util.Map map) {
        this.a = list;
        this.b = map;
        this.c = null;
    }

    public static defpackage.ajex e(defpackage.ajex ajexVar) {
        if (((defpackage.ajlz) ajexVar.b(defpackage.ajlz.class)) == null) {
            return ajexVar;
        }
        defpackage.ajeu ajeuVar = new defpackage.ajeu(1);
        java.util.List<defpackage.ajew> list = ajexVar.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        for (defpackage.ajew ajewVar : list) {
            arrayList.add(new defpackage.ajew(ajewVar.g, ajewVar.f, ajewVar.c, ajewVar.d, ajewVar.e, ajeuVar));
        }
        return new defpackage.ajex(arrayList, ajexVar.b, ajexVar);
    }

    public static final defpackage.ajex f(defpackage.ajqb ajqbVar, ajel ajelVar) throws java.security.GeneralSecurityException {
        j(ajqbVar);
        java.util.List<defpackage.ajew> listN = n(ajqbVar, ajelVar);
        if (o(ajelVar)) {
            java.util.HashSet hashSet = new java.util.HashSet();
            boolean z = false;
            for (defpackage.ajew ajewVar : listN) {
                int i = ajewVar.c;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
                if (hashSet.contains(numValueOf)) {
                    throw new java.security.GeneralSecurityException(a.bs(i, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
                hashSet.add(numValueOf);
                z |= ajewVar.d;
            }
            if (!z) {
                throw new java.security.GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        return new defpackage.ajex(listN, new java.util.HashMap());
    }

    public static void j(defpackage.ajqb ajqbVar) throws java.security.GeneralSecurityException {
        if (ajqbVar == null || ajqbVar.c.size() <= 0) {
            throw new java.security.GeneralSecurityException("empty keyset");
        }
    }

    @java.lang.Deprecated
    public static final defpackage.ajex k(ajyk ajykVar) throws java.security.GeneralSecurityException {
        int i;
        int i2;
        java.lang.Object objF = ajykVar.b;
        if (objF == null) {
            objF = defpackage.ajee.f(ajykVar.n().i(), defpackage.ajfj.b);
        }
        ajel ajelVar = defpackage.ajfj.b;
        defpackage.ajet ajetVar = new defpackage.ajet();
        ajetVar.b = ajelVar;
        defpackage.ajer ajerVar = new defpackage.ajer((ajsz) objF);
        defpackage.ajes ajesVar = defpackage.ajes.a;
        ajerVar.c = ajesVar;
        defpackage.ajet ajetVar2 = ajerVar.d;
        if (ajetVar2 != null) {
            ajetVar2.a();
        }
        ajerVar.a = true;
        if (ajerVar.d != null) {
            throw new java.lang.IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        ajetVar.a();
        ajerVar.d = ajetVar;
        java.util.List<defpackage.ajer> list = ajetVar.a;
        list.add(ajerVar);
        if (ajetVar.d) {
            throw new java.security.GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        ajetVar.d = true;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int i3 = 0;
        int i4 = 0;
        while (i4 < list.size() - 1) {
            int i5 = i4 + 1;
            if (((defpackage.ajer) list.get(i4)).c == ajesVar && ((defpackage.ajer) list.get(i5)).c != ajesVar) {
                throw new java.security.GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i4 = i5;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.Integer num = null;
        for (defpackage.ajer ajerVar2 : list) {
            defpackage.ajeq ajeqVar = ajerVar2.b;
            defpackage.ajes ajesVar2 = ajerVar2.c;
            if (ajesVar2 == null) {
                throw new java.security.GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            int i6 = 3;
            if (ajesVar2 == ajesVar) {
                int i7 = i3;
                while (true) {
                    if (i7 != 0 && !hashSet.contains(java.lang.Integer.valueOf(i7))) {
                        break;
                    }
                    java.nio.charset.Charset charset = defpackage.ajnf.a;
                    i7 = i3;
                    while (i7 == 0) {
                        byte[] bArrB = defpackage.ajna.b(4);
                        i7 = (bArrB[3] & 255) | ((bArrB[i3] & 255) << 24) | ((bArrB[1] & 255) << 16) | ((bArrB[2] & 255) << 8);
                        i3 = 0;
                    }
                }
                i = i7;
            } else {
                i = 0;
            }
            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
            if (hashSet.contains(numValueOf)) {
                throw new java.security.GeneralSecurityException(a.bs(i, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            aiql aiqlVar = ajerVar2.f;
            if (ajetVar.b == null) {
                throw new java.security.GeneralSecurityException("Cannot build keyset: a target Configuration is required to generate a key from Parameters. Use Builder#setConfiguration.");
            }
            ajsz ajszVar = ajerVar2.e;
            aiql aiqlVarB = ajma.a.b(ajszVar, true != ajszVar.dU() ? null : numValueOf);
            defpackage.ajeq ajeqVar2 = defpackage.ajeq.a;
            if (ajeqVar2.equals(ajeqVar)) {
                i2 = i6;
            } else if (defpackage.ajeq.b.equals(ajeqVar)) {
                i2 = 4;
            } else {
                if (!defpackage.ajeq.c.equals(ajeqVar)) {
                    throw new java.lang.IllegalStateException("Unknown key status");
                }
                i6 = 5;
                i2 = i6;
            }
            boolean z = ajerVar2.a;
            defpackage.ajew ajewVar = new defpackage.ajew(aiqlVarB, i2, i, z, false, defpackage.ajew.a);
            if (z) {
                if (num != null) {
                    throw new java.security.GeneralSecurityException("Two primaries were set");
                }
                if (ajeqVar != ajeqVar2) {
                    throw new java.security.GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(ajewVar);
            i3 = 0;
        }
        if (num != null) {
            return e(new defpackage.ajex(arrayList, ajetVar.c));
        }
        throw new java.security.GeneralSecurityException("No primary was set");
    }

    public static void l(aiql aiqlVar, int i) throws java.security.GeneralSecurityException {
        java.lang.Integer numM = aiqlVar.m();
        if (numM != null && numM.intValue() != i) {
            throw new java.security.GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
    }

    private final defpackage.ajex m() {
        defpackage.ajex ajexVar = this.c;
        return ajexVar != null ? ajexVar : this;
    }

    private static java.util.List n(defpackage.ajqb ajqbVar, ajel ajelVar) throws java.security.GeneralSecurityException {
        aiql ajlxVar;
        boolean z;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajqbVar.c.size());
        for (defpackage.ajqa ajqaVar : ajqbVar.c) {
            int i = ajqaVar.e;
            try {
                akxm akxmVarQ = q(ajqaVar);
                ajff ajffVar = (ajff) ajelVar.a(ajff.class);
                if (ajffVar == null) {
                    throw new java.security.GeneralSecurityException("Passed in configuration cannot be used to serialize into proto keyset format.");
                }
                ajlxVar = ajffVar.a(akxmVarQ, defpackage.ajfk.a);
                z = false;
            } catch (java.security.GeneralSecurityException e) {
                if (o(ajelVar)) {
                    throw e;
                }
                ajlxVar = new ajlx(q(ajqaVar), defpackage.ajfk.a);
                z = true;
            }
            if (o(ajelVar)) {
                int iW = a.W(ajqaVar.d);
                if (iW == 0) {
                    iW = 1;
                }
                if (!p(iW)) {
                    throw new java.security.GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                }
            }
            int iW2 = a.W(ajqaVar.d);
            if (iW2 == 0) {
                iW2 = 1;
            }
            arrayList.add(new defpackage.ajew(ajlxVar, iW2, i, i == ajqbVar.b, z, defpackage.ajew.a));
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    private static boolean o(ajel ajelVar) {
        return ajelVar.a(defpackage.ajnc.class) == null;
    }

    private static boolean p(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    private static akxm q(defpackage.ajqa ajqaVar) {
        int i = ajqaVar.e;
        int iAa = a.aa(ajqaVar.f);
        java.lang.Integer numValueOf = (iAa == 0 || iAa != 5) ? java.lang.Integer.valueOf(i) : null;
        defpackage.ajpy ajpyVar = ajqaVar.c;
        if (ajpyVar == null) {
            ajpyVar = defpackage.ajpy.a;
        }
        java.lang.String str = ajpyVar.b;
        defpackage.ajpy ajpyVar2 = ajqaVar.c;
        akzc akzcVar = (ajpyVar2 == null ? defpackage.ajpy.a : ajpyVar2).c;
        if (ajpyVar2 == null) {
            ajpyVar2 = defpackage.ajpy.a;
        }
        int iAb = a.ab(ajpyVar2.d);
        if (iAb == 0) {
            iAb = 1;
        }
        defpackage.ajfd ajfdVarB = aftt.B(iAb);
        int iAa2 = a.aa(ajqaVar.f);
        return akxm.d(str, akzcVar, ajfdVarB, aftt.C(iAa2 != 0 ? iAa2 : 1), numValueOf);
    }

    public final int a() {
        return this.a.size();
    }

    public final defpackage.ajej b(java.lang.Class cls) {
        return (defpackage.ajej) this.b.get(cls);
    }

    public final defpackage.ajew c(int i) {
        if (i < 0 || i >= a()) {
            throw new java.lang.IndexOutOfBoundsException("Invalid index " + i + " for keyset of size " + a());
        }
        java.util.List list = this.a;
        defpackage.ajew ajewVar = (defpackage.ajew) list.get(i);
        if (!p(ajewVar.f)) {
            throw new java.lang.IllegalStateException(a.bs(i, "Keyset-Entry at position ", " has wrong status"));
        }
        if (ajewVar.e) {
            throw new java.lang.IllegalStateException(a.bs(i, "Keyset-Entry at position ", " didn't parse correctly"));
        }
        return (defpackage.ajew) list.get(i);
    }

    public final defpackage.ajew d() {
        for (defpackage.ajew ajewVar : this.a) {
            if (ajewVar != null && ajewVar.d) {
                if (ajewVar.b == defpackage.ajeq.a) {
                    return ajewVar;
                }
                throw new java.lang.IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new java.lang.IllegalStateException("Keyset has no valid primary");
    }

    public final defpackage.ajqb g(ajel ajelVar) {
        akzx akzxVarM = defpackage.ajqb.a.m();
        for (defpackage.ajew ajewVar : this.a) {
            aiql aiqlVarA = ajewVar.a();
            int i = ajewVar.f;
            int i2 = ajewVar.c;
            ajff ajffVar = (ajff) ajelVar.a(ajff.class);
            if (ajffVar == null) {
                throw new java.security.GeneralSecurityException("Passed in configuration cannot be used to parse and serialize proto keysets.");
            }
            akxm akxmVarB = ajffVar.b(aiqlVarA, defpackage.ajfk.a);
            l(aiqlVarA, i2);
            akzx akzxVarM2 = defpackage.ajqa.a.m();
            akzx akzxVarM3 = defpackage.ajpy.a.m();
            java.lang.Object obj = akxmVarB.b;
            akzxVarM3.u();
            defpackage.ajpy ajpyVar = (defpackage.ajpy) akzxVarM3.b;
            j$.util.Objects.requireNonNull(obj);
            ajpyVar.b = (java.lang.String) obj;
            java.lang.Object obj2 = akxmVarB.d;
            akzxVarM3.u();
            defpackage.ajpy ajpyVar2 = (defpackage.ajpy) akzxVarM3.b;
            j$.util.Objects.requireNonNull(obj2);
            ajpyVar2.c = (akzc) obj2;
            int iD = aftt.D((defpackage.ajfd) akxmVarB.e);
            akzxVarM3.u();
            ((defpackage.ajpy) akzxVarM3.b).d = a.R(iD);
            akzxVarM2.u();
            defpackage.ajqa ajqaVar = (defpackage.ajqa) akzxVarM2.b;
            defpackage.ajpy ajpyVar3 = (defpackage.ajpy) akzxVarM3.p();
            j$.util.Objects.requireNonNull(ajpyVar3);
            ajqaVar.c = ajpyVar3;
            ajqaVar.b |= 1;
            akzxVarM2.u();
            ((defpackage.ajqa) akzxVarM2.b).d = a.Q(i);
            akzxVarM2.u();
            ((defpackage.ajqa) akzxVarM2.b).e = i2;
            int iE = aftt.E((ajfe) akxmVarB.c);
            akzxVarM2.u();
            ((defpackage.ajqa) akzxVarM2.b).f = a.S(iE);
            defpackage.ajqa ajqaVar2 = (defpackage.ajqa) akzxVarM2.p();
            akzxVarM.u();
            defpackage.ajqb ajqbVar = (defpackage.ajqb) akzxVarM.b;
            j$.util.Objects.requireNonNull(ajqaVar2);
            alat alatVar = ajqbVar.c;
            if (!alatVar.c()) {
                ajqbVar.c = alad.J(alatVar);
            }
            ajqbVar.c.add(ajqaVar2);
            if (ajewVar.d) {
                akzxVarM.u();
                ((defpackage.ajqb) akzxVarM.b).b = i2;
            }
        }
        return (defpackage.ajqb) akzxVarM.p();
    }

    @java.lang.Deprecated
    final defpackage.ajqd h() {
        try {
            return defpackage.ajfm.a(g(defpackage.ajfj.b));
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalArgumentException("Cannot get keyset info: key cannot be serialized", e);
        }
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [ajmy, java.lang.Object] */
    public final java.lang.Object i(ajel ajelVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        for (int i = 0; i < a(); i++) {
            java.util.List list = this.a;
            defpackage.ajeq ajeqVar = ((defpackage.ajew) list.get(i)).b;
            defpackage.ajeq ajeqVar2 = defpackage.ajeq.a;
            if (ajeqVar == ajeqVar2) {
                for (int i2 = 0; i2 < a(); i2++) {
                    if (((defpackage.ajew) list.get(i2)).e || !p(((defpackage.ajew) list.get(i2)).f)) {
                        ajlx ajlxVar = ((defpackage.ajew) list.get(i2)).g;
                        throw new java.security.GeneralSecurityException("Key parsing of key with index " + i2 + " and type_url " + ((java.lang.String) (ajlxVar instanceof ajlx ? ajlxVar.aq(defpackage.ajfk.a).b : "(unknown)")) + " failed, unable to get primitive");
                    }
                }
                defpackage.ajex ajexVarM = m();
                int i3 = defpackage.ajfm.a;
                boolean z = false;
                for (int i4 = 0; i4 < ajexVarM.a(); i4++) {
                    defpackage.ajew ajewVarC = ajexVarM.c(i4);
                    if (ajewVarC.b == ajeqVar2 && ajewVarC.d) {
                        if (z) {
                            throw new java.security.GeneralSecurityException("keyset contains multiple primary keys");
                        }
                        z = true;
                    }
                }
                defpackage.ajex ajexVarM2 = m();
                apjb apjbVar = (apjb) ((ajmr) ajelVar).c.get(cls);
                if (apjbVar != null) {
                    return apjbVar.b.a(ajexVarM2, new anyd(ajelVar, apjbVar));
                }
                throw new java.security.GeneralSecurityException("No wrapper registered for primitive class: ".concat(java.lang.String.valueOf(cls.getName())));
            }
        }
        throw new java.security.GeneralSecurityException("keyset must contain at least one ENABLED key");
    }

    public final java.lang.String toString() {
        return h().toString();
    }

    private ajex(java.util.List list, java.util.Map map, defpackage.ajex ajexVar) {
        this.a = list;
        this.b = map;
        this.c = ajexVar;
    }
}
