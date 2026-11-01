package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class owo extends amzm {
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

    public owo(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3, amzg amzgVar4, amzg amzgVar5, amzg amzgVar6, amzg amzgVar7, amzg amzgVar8, amzg amzgVar9, amzg amzgVar10, amzg amzgVar11, amzg amzgVar12, amzg amzgVar13, amzg amzgVar14, amzg amzgVar15, amzg amzgVar16) {
        super(amyzVar2, new defpackage.amzw(defpackage.owo.class), amyzVar);
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
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.lang.String str;
        android.graphics.drawable.Drawable drawable;
        defpackage.abwd abwdVar;
        defpackage.owy owyVar;
        java.util.List list = (java.util.List) obj;
        java.lang.String str2 = (java.lang.String) list.get(0);
        j$.util.Optional optional = (j$.util.Optional) list.get(1);
        j$.util.Optional optional2 = (j$.util.Optional) list.get(2);
        j$.util.Optional optional3 = (j$.util.Optional) list.get(3);
        android.graphics.drawable.Drawable drawable2 = (android.graphics.drawable.Drawable) list.get(4);
        boolean zBooleanValue = ((java.lang.Boolean) list.get(5)).booleanValue();
        defpackage.abwd abwdVar2 = (defpackage.abwd) list.get(6);
        boolean zBooleanValue2 = ((java.lang.Boolean) list.get(7)).booleanValue();
        boolean zBooleanValue3 = ((java.lang.Boolean) list.get(8)).booleanValue();
        boolean zBooleanValue4 = ((java.lang.Boolean) list.get(9)).booleanValue();
        boolean zBooleanValue5 = ((java.lang.Boolean) list.get(10)).booleanValue();
        boolean zBooleanValue6 = ((java.lang.Boolean) list.get(11)).booleanValue();
        boolean zBooleanValue7 = ((java.lang.Boolean) list.get(12)).booleanValue();
        defpackage.owy owyVar2 = (defpackage.owy) list.get(13);
        boolean zBooleanValue8 = ((java.lang.Boolean) list.get(14)).booleanValue();
        j$.util.Optional optional4 = (j$.util.Optional) list.get(15);
        defpackage.owm owmVar = new defpackage.owm();
        owmVar.b(defpackage.abwd.a);
        boolean z = false;
        owmVar.a(false);
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null callId");
        }
        owmVar.a = str2;
        if (optional == null) {
            throw new java.lang.NullPointerException("Null incomingWillDisconnectApp");
        }
        owmVar.b = optional;
        if (optional2 == null) {
            throw new java.lang.NullPointerException("Null incomingWillDisconnectAppLegacy");
        }
        owmVar.c = optional2;
        owmVar.d = ((java.lang.Boolean) optional3.orElse(java.lang.Boolean.FALSE)).booleanValue();
        short s = owmVar.p;
        owmVar.p = (short) (s | 1);
        if (drawable2 == null) {
            throw new java.lang.NullPointerException("Null answerPuckDrawable");
        }
        owmVar.e = drawable2;
        owmVar.f = zBooleanValue;
        owmVar.p = (short) (s | 3);
        owmVar.b(abwdVar2);
        owmVar.h = zBooleanValue2;
        short s2 = owmVar.p;
        owmVar.i = zBooleanValue3;
        owmVar.j = zBooleanValue4;
        owmVar.p = (short) (s2 | 28);
        owmVar.a(zBooleanValue6);
        owmVar.m = zBooleanValue7;
        short s3 = owmVar.p;
        owmVar.p = (short) (s3 | 128);
        if (owyVar2 == null) {
            throw new java.lang.NullPointerException("Null selectedAnswerMethod");
        }
        owmVar.n = owyVar2;
        if (zBooleanValue4 && zBooleanValue5) {
            z = true;
        }
        owmVar.k = z;
        owmVar.o = zBooleanValue8;
        owmVar.p = (short) (s3 | 416);
        boolean zIsPresent = optional4.isPresent();
        int i = owmVar.p | 512;
        owmVar.p = (short) i;
        if (i == 1023 && (str = owmVar.a) != null && (drawable = owmVar.e) != null && (abwdVar = owmVar.g) != null && (owyVar = owmVar.n) != null) {
            return aiql.z(j$.util.Optional.of(new defpackage.own(str, owmVar.b, owmVar.c, owmVar.d, drawable, owmVar.f, abwdVar, owmVar.h, owmVar.i, owmVar.j, owmVar.k, owmVar.l, owmVar.m, owyVar, owmVar.o, zIsPresent)));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (owmVar.a == null) {
            sb.append(" callId");
        }
        if ((owmVar.p & 1) == 0) {
            sb.append(" shouldShowAnswerHint");
        }
        if (owmVar.e == null) {
            sb.append(" answerPuckDrawable");
        }
        if ((owmVar.p & 2) == 0) {
            sb.append(" isVideoCall");
        }
        if (owmVar.g == null) {
            sb.append(" photoInfo");
        }
        if ((owmVar.p & 4) == 0) {
            sb.append(" isRttCall");
        }
        if ((owmVar.p & 8) == 0) {
            sb.append(" isVideoUpgradeRequest");
        }
        if ((owmVar.p & 16) == 0) {
            sb.append(" canUpgradeToRttCall");
        }
        if ((owmVar.p & 32) == 0) {
            sb.append(" shouldShowAnswerAsRttButton");
        }
        if ((owmVar.p & 64) == 0) {
            sb.append(" isEmergencyCallback");
        }
        if ((owmVar.p & 128) == 0) {
            sb.append(" shouldAnswerButtonShowAnswerAndEndHeldCallLabel");
        }
        if (owmVar.n == null) {
            sb.append(" selectedAnswerMethod");
        }
        if ((owmVar.p & 256) == 0) {
            sb.append(" isSpamCall");
        }
        if ((owmVar.p & 512) == 0) {
            sb.append(" hasCallBackground");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    protected final ajcq c() {
        amzg amzgVar = this.q;
        amzg amzgVar2 = this.p;
        amzg amzgVar3 = this.o;
        amzg amzgVar4 = this.n;
        amzg amzgVar5 = this.m;
        amzg amzgVar6 = this.l;
        amzg amzgVar7 = this.k;
        amzg amzgVar8 = this.j;
        amzg amzgVar9 = this.i;
        amzg amzgVar10 = this.h;
        amzg amzgVar11 = this.g;
        amzg amzgVar12 = this.f;
        amzg amzgVar13 = this.e;
        amzg amzgVar14 = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar14.d(), amzgVar13.d(), amzgVar12.d(), amzgVar11.d(), amzgVar10.d(), amzgVar9.d(), amzgVar8.d(), amzgVar7.d(), amzgVar6.d(), amzgVar5.d(), amzgVar4.d(), amzgVar3.d(), amzgVar2.d(), amzgVar.d()});
    }
}
