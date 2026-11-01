package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amcn {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    private java.lang.Object e;

    public amcn(defpackage.amcp amcpVar) {
        this.a = amcpVar.b;
        this.b = amcpVar.c;
        this.c = amcpVar.d;
        this.e = amcpVar.e;
        this.d = amcpVar.f;
    }

    public final defpackage.amcp a() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        if (b().size() != j$.util.DesugarArrays.stream(c().trim().split(" ")).filter(new defpackage.alzc(17)).count()) {
            defpackage.amcp.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AnnotatedTextWrapper$Builder", "build", 78, "AnnotatedTextWrapper.java").z("Token timing hints size (%s) is different than the number of tokens (%s). Will use zero hints for all tokens.", b().size(), c().split(" ").length);
            g(aify.n(java.util.Collections.nCopies(c().trim().split(" ").length, 0)));
        }
        java.lang.Object obj5 = this.a;
        if (obj5 != null && (obj = this.b) != null && (obj2 = this.c) != null && (obj3 = this.e) != null && (obj4 = this.d) != null) {
            return new defpackage.amcp((java.lang.String) obj5, (aify) obj, (aigf) obj2, (aify) obj3, (defpackage.amen) obj4);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.a == null) {
            sb.append(" text");
        }
        if (this.b == null) {
            sb.append(" tokensTiming");
        }
        if (this.c == null) {
            sb.append(" textOffsets");
        }
        if (this.e == null) {
            sb.append(" lowConfidenceSpans");
        }
        if (this.d == null) {
            sb.append(" transcriptionEndpointer");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final aify b() {
        java.lang.Object obj = this.b;
        if (obj != null) {
            return (aify) obj;
        }
        throw new java.lang.IllegalStateException("Property \"tokensTiming\" has not been set");
    }

    public final java.lang.String c() {
        java.lang.Object obj = this.a;
        if (obj != null) {
            return (java.lang.String) obj;
        }
        throw new java.lang.IllegalStateException("Property \"text\" has not been set");
    }

    public final void d(java.lang.Iterable iterable) {
        this.e = aify.j(iterable);
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.a = str;
    }

    public final void f(aigf aigfVar) {
        if (aigfVar == null) {
            throw new java.lang.NullPointerException("Null textOffsets");
        }
        this.c = aigfVar;
    }

    public final void g(java.util.List list) {
        this.b = aify.n(list);
    }

    public final void h(defpackage.amen amenVar) {
        if (amenVar == null) {
            throw new java.lang.NullPointerException("Null transcriptionEndpointer");
        }
        this.d = amenVar;
    }

    public final defpackage.alvu i() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3 = this.b;
        if (obj3 != null && (obj = this.a) != null && (obj2 = this.e) != null) {
            return new defpackage.alvu((defpackage.alxx) obj3, (defpackage.almy) obj, (j$.util.Optional) this.c, (j$.util.Optional) this.d, (defpackage.almm) obj2);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.b == null) {
            sb.append(" duplexSpamDecision");
        }
        if (this.a == null) {
            sb.append(" triggeringEvent");
        }
        if (this.e == null) {
            sb.append(" botIntent");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void j(defpackage.almm almmVar) {
        if (almmVar == null) {
            throw new java.lang.NullPointerException("Null botIntent");
        }
        this.e = almmVar;
    }

    public final void k(java.lang.Object obj) {
        this.d = j$.util.Optional.of(obj);
    }

    public final void l(defpackage.almy almyVar) {
        if (almyVar == null) {
            throw new java.lang.NullPointerException("Null triggeringEvent");
        }
        this.a = almyVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ahyc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ahyc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [ahag, java.lang.Object] */
    public final ahak m() {
        ahvr.cj(this.d, "No ViewBinder");
        boolean z = true;
        if (this.a != null && this.b == null) {
            z = false;
        }
        ahvr.bZ(z, "DataDiffer was provided without a StableIdFunction or Equivalence.");
        if (this.b != null && this.a == null) {
            this.a = new ahai();
        }
        this.e = new akbx();
        return new ahak((ahyc) this.d, (ahyc) this.c, (ahxt) this.b, (ahag) this.a, (akbx) this.e);
    }

    public final void n(ahyc ahycVar) {
        this.c = ahycVar;
        this.b = new ahyd(ahycVar, ahxr.a);
    }

    public final void o(ahao ahaoVar) {
        this.d = new ahye(ahaoVar);
    }

    public amcn(byte[] bArr) {
        this.c = j$.util.Optional.empty();
        this.d = j$.util.Optional.empty();
    }
}
