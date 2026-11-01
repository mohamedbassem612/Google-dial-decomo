package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agrb implements defpackage.aehm {
    private final ahyn a;

    public agrb(ahyn ahynVar) {
        this.a = ahynVar;
    }

    public static final java.lang.String i(defpackage.agon agonVar) {
        return java.lang.String.valueOf(agonVar.a.a);
    }

    @Override // defpackage.aehm
    public final /* synthetic */ defpackage.aeho a(java.lang.Object obj) {
        int i;
        defpackage.agon agonVar = (defpackage.agon) obj;
        if (!g(agonVar)) {
            return null;
        }
        agoq agoqVar = agonVar.b;
        apdi apdiVar = agpv.a;
        agoqVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) agoqVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        agpu agpuVar = (agpu) objJ;
        boolean z = agpuVar.c;
        int iAQ = a.aQ(agpuVar.e);
        if (iAQ == 0) {
            iAQ = 1;
        }
        int i2 = iAQ - 1;
        if (i2 != 0) {
            i = i2 != 1 ? 3 : 2;
        } else {
            i = 1;
        }
        defpackage.aehn aehnVar = new defpackage.aehn();
        aehnVar.a(false);
        aehnVar.c = 1;
        aehnVar.a(z);
        aehnVar.c = i;
        if (aehnVar.b == 1) {
            return new defpackage.aeho(aehnVar.a, i);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (aehnVar.b == 0) {
            sb.append(" isG1User");
        }
        if (aehnVar.c == 0) {
            sb.append(" isUnicornUser");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.aehm
    public final /* bridge */ /* synthetic */ java.lang.String b(java.lang.Object obj) {
        return i((defpackage.agon) obj);
    }

    @Override // defpackage.aehm
    public final /* synthetic */ java.lang.String c(java.lang.Object obj) {
        return ((defpackage.agon) obj).b.g;
    }

    @Override // defpackage.aehm
    public final /* synthetic */ java.lang.String d(java.lang.Object obj) {
        return ((defpackage.agon) obj).b.h;
    }

    @Override // defpackage.aehm
    public final /* synthetic */ java.lang.String e(java.lang.Object obj) {
        return ((defpackage.agon) obj).b.d;
    }

    @Override // defpackage.aehm
    public final /* synthetic */ java.lang.String f(java.lang.Object obj) {
        agoq agoqVar = ((defpackage.agon) obj).b;
        if ((agoqVar.b & 4) != 0) {
            return agoqVar.e;
        }
        return null;
    }

    @Override // defpackage.aehm
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean g(defpackage.agon agonVar) {
        return ((java.lang.String) this.a.a).equals(agonVar.b.j);
    }
}
