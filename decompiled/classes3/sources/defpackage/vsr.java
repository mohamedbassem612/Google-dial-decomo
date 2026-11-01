package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vsr extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;
    private final amzg e;
    private final amzg f;
    private final amzg g;
    private final amzg h;
    private final amzg i;
    private final amzg j;
    private final amzg k;
    private final amzg l;
    private final amzg m;
    private final amzg n;
    private final amzg o;
    private final amzg p;
    private final amzg q;
    private final amzg r;
    private final amzg s;

    public vsr(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12, amzg amzgVar13, amzg amzgVar14, amzg amzgVar15, amzg amzgVar16, amzg amzgVar17, amzg amzgVar18) {
        super(amyzVar2, new defpackage.amzw(defpackage.vsr.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
        this.e = amzs.b(amzgVar4);
        this.f = amzs.b(amzgVar5);
        this.g = amzs.b(amzgVar6);
        this.h = amzs.b(amzgVar7);
        this.i = amzs.b(amzgVar8);
        this.j = amzs.b(amzgVar9);
        this.k = amzs.b(amzgVar10);
        this.l = amzs.b(amzgVar11);
        this.m = amzs.b(amzgVar12);
        this.n = amzs.b(amzgVar13);
        this.o = amzs.b(amzgVar14);
        this.p = amzs.b(amzgVar15);
        this.q = amzs.b(amzgVar16);
        this.r = amzs.b(amzgVar17);
        this.s = amzs.b(amzgVar18);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        defpackage.vrr vrrVar;
        defpackage.vrr vrrVar2;
        defpackage.vrr vrrVar3;
        defpackage.vrr vrrVar4;
        java.util.List list = (java.util.List) obj;
        boolean zBooleanValue = ((java.lang.Boolean) list.get(0)).booleanValue();
        defpackage.vrr vrrVar5 = (defpackage.vrr) list.get(1);
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(3)).booleanValue();
        j$.util.Optional optional2 = (j$.util.Optional) list.get(4);
        defpackage.vrr vrrVar6 = (defpackage.vrr) list.get(5);
        defpackage.vrr vrrVar7 = (defpackage.vrr) list.get(6);
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(7)).booleanValue();
        j$.util.Optional optional3 = (j$.util.Optional) list.get(8);
        defpackage.vrr vrrVar8 = (defpackage.vrr) list.get(9);
        j$.util.Optional optional4 = (j$.util.Optional) list.get(10);
        j$.util.Optional optional5 = (j$.util.Optional) list.get(11);
        android.content.Intent intent = (android.content.Intent) list.get(12);
        defpackage.vrr vrrVar9 = (defpackage.vrr) list.get(13);
        android.content.Intent intent2 = (android.content.Intent) list.get(14);
        j$.util.Optional optional6 = (j$.util.Optional) list.get(15);
        j$.util.Optional optional7 = (j$.util.Optional) list.get(16);
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(17)).booleanValue();
        defpackage.vrs vrsVar = new defpackage.vrs();
        defpackage.vrr vrrVar10 = defpackage.vrr.c;
        vrsVar.g(vrrVar10);
        vrsVar.h(j$.util.Optional.empty());
        vrsVar.i(vrrVar10);
        vrsVar.d(vrrVar10);
        vrsVar.e(j$.util.Optional.empty());
        vrsVar.a(vrrVar10);
        vrsVar.f(j$.util.Optional.empty());
        vrsVar.c(j$.util.Optional.empty());
        vrsVar.b(j$.util.Optional.empty());
        vrsVar.a = zBooleanValue2;
        byte b = vrsVar.l;
        vrsVar.b = zBooleanValue;
        vrsVar.l = (byte) (b | 3);
        vrsVar.g(vrrVar5);
        vrsVar.h(optional);
        vrsVar.i(vrrVar6);
        vrsVar.d(vrrVar7);
        vrsVar.e(optional3);
        vrsVar.a(vrrVar8);
        vrsVar.c(optional4);
        vrsVar.b(optional6);
        vrsVar.f(optional5);
        int i = vrsVar.l | 4;
        vrsVar.l = (byte) i;
        if (i == 7 && (vrrVar = vrsVar.c) != null && (vrrVar2 = vrsVar.e) != null && (vrrVar3 = vrsVar.f) != null && (vrrVar4 = vrsVar.h) != null) {
            defpackage.vrt vrtVar = new defpackage.vrt(vrsVar.a, vrsVar.b, vrrVar, vrsVar.d, vrrVar2, vrrVar3, vrsVar.g, vrrVar4, vrsVar.i, vrsVar.j, vrsVar.k, zBooleanValue4);
            defpackage.vrq vrqVarA = defpackage.vru.a();
            vrqVarA.d(zBooleanValue3);
            vrqVarA.e(intent);
            vrqVarA.b(intent2);
            vrqVarA.f(optional7);
            vrqVarA.c(vrrVar9);
            vrqVarA.h(j$.util.Optional.of(vrtVar));
            vrqVarA.i(optional2);
            return aiql.z(vrqVarA.a());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((vrsVar.l & 1) == 0) {
            sb.append(" shouldRemoveAllVisualVoicemailPreferences");
        }
        if ((vrsVar.l & 2) == 0) {
            sb.append(" isVvmActivated");
        }
        if (vrsVar.c == null) {
            sb.append(" voicemailPreferenceState");
        }
        if (vrsVar.e == null) {
            sb.append(" voicemailTranscriptionPreferenceState");
        }
        if (vrsVar.f == null) {
            sb.append(" donateTranscribedPreferenceState");
        }
        if (vrsVar.h == null) {
            sb.append(" changeGreetingPreferenceState");
        }
        if ((vrsVar.l & 4) == 0) {
            sb.append(" isAutoDownloadOverCellularSettingAvailable");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    protected final ajcq c() {
        amzg amzgVar = this.s;
        amzg amzgVar2 = this.r;
        amzg amzgVar3 = this.q;
        amzg amzgVar4 = this.p;
        amzg amzgVar5 = this.o;
        amzg amzgVar6 = this.n;
        amzg amzgVar7 = this.m;
        amzg amzgVar8 = this.l;
        amzg amzgVar9 = this.k;
        amzg amzgVar10 = this.j;
        amzg amzgVar11 = this.i;
        amzg amzgVar12 = this.h;
        amzg amzgVar13 = this.g;
        amzg amzgVar14 = this.f;
        amzg amzgVar15 = this.e;
        amzg amzgVar16 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar16.d(), amzgVar15.d(), amzgVar14.d(), amzgVar13.d(), amzgVar12.d(), amzgVar11.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
