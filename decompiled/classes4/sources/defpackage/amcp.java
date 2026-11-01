package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amcp {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/AnnotatedTextWrapper");
    public final java.lang.String b;
    public final aify c;
    public final aigf d;
    public final aify e;
    public final defpackage.amen f;

    public amcp(java.lang.String str, aify aifyVar, aigf aigfVar, aify aifyVar2, defpackage.amen amenVar) {
        this.b = str;
        this.c = aifyVar;
        this.d = aigfVar;
        this.e = aifyVar2;
        this.f = amenVar;
    }

    public static defpackage.amcn c() {
        defpackage.amcn amcnVar = new defpackage.amcn();
        amcnVar.f(aikj.b);
        java.util.List list = aike.a;
        amcnVar.d(list);
        amcnVar.g(list);
        amcnVar.h(defpackage.amen.a);
        return amcnVar;
    }

    public final aify a() {
        return (aify) this.d.getOrDefault(defpackage.amco.a, aike.a);
    }

    public final aify b(defpackage.altp altpVar) {
        return (aify) j$.util.Collection.-EL.stream(this.e).filter(new defpackage.amcc(altpVar, 3)).map(new defpackage.alyy(altpVar, 14)).filter(new defpackage.amcc(this, 4)).map(new defpackage.alyy(altpVar, 15)).collect(aido.a);
    }

    public final j$.util.Optional d(defpackage.altp altpVar, long j) {
        java.lang.String str = this.b;
        defpackage.altp altpVarF = altpVar.f(str);
        java.lang.String strH = altpVarF.h(str);
        if (strH.isEmpty()) {
            return j$.util.Optional.empty();
        }
        akzx akzxVarM = defpackage.amft.a.m();
        akzx akzxVarM2 = defpackage.amfp.a.m();
        akzxVarM2.u();
        defpackage.amfp amfpVar = (defpackage.amfp) akzxVarM2.b;
        j$.util.Objects.requireNonNull(strH);
        amfpVar.b |= 1;
        amfpVar.c = strH;
        akzx akzxVarM3 = defpackage.amfy.a.m();
        akzxVarM3.u();
        defpackage.amfy amfyVar = (defpackage.amfy) akzxVarM3.b;
        j$.util.Objects.requireNonNull(strH);
        amfyVar.b |= 1;
        amfyVar.c = strH;
        akzxVarM3.bd(b(altpVarF));
        akzxVarM2.u();
        defpackage.amfp amfpVar2 = (defpackage.amfp) akzxVarM2.b;
        defpackage.amfy amfyVar2 = (defpackage.amfy) akzxVarM3.p();
        j$.util.Objects.requireNonNull(amfyVar2);
        amfpVar2.d = amfyVar2;
        amfpVar2.b |= 2;
        akzxVarM.u();
        defpackage.amft amftVar = (defpackage.amft) akzxVarM.b;
        defpackage.amfp amfpVar3 = (defpackage.amfp) akzxVarM2.p();
        j$.util.Objects.requireNonNull(amfpVar3);
        amftVar.d = amfpVar3;
        amftVar.c = 1;
        akzxVarM.u();
        defpackage.amft amftVar2 = (defpackage.amft) akzxVarM.b;
        amftVar2.b |= 2;
        amftVar2.f = j;
        defpackage.amft amftVar3 = (defpackage.amft) akzxVarM.p();
        defpackage.amcd amcdVarA = defpackage.amce.a();
        amcdVarA.c(amftVar3);
        return j$.util.Optional.of(amcdVarA.a());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.amcp) {
            defpackage.amcp amcpVar = (defpackage.amcp) obj;
            if (this.b.equals(amcpVar.b) && ahvr.aP(this.c, amcpVar.c) && this.d.equals(amcpVar.d) && ahvr.aP(this.e, amcpVar.e) && this.f.equals(amcpVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.amen amenVar = this.f;
        aify aifyVar = this.e;
        aigf aigfVar = this.d;
        return "AnnotatedTextWrapper{text=" + this.b + ", tokensTiming=" + java.lang.String.valueOf(this.c) + ", textOffsets=" + java.lang.String.valueOf(aigfVar) + ", lowConfidenceSpans=" + java.lang.String.valueOf(aifyVar) + ", transcriptionEndpointer=" + java.lang.String.valueOf(amenVar) + '}';
    }

    public amcp() {
        throw null;
    }
}
