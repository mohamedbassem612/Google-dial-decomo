package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ajyi {
    public final java.lang.Object a;

    public ajyi(byte[] bArr) {
        ahzh ahzhVar = new ahzh();
        ahzhVar.e();
        this.a = ahzhVar;
    }

    public static defpackage.ajyi A(int i) {
        return new defpackage.ajyi(ajst.b(ajna.b(i)));
    }

    public static defpackage.ajyi B(byte[] bArr) {
        return new defpackage.ajyi(ajst.b(bArr));
    }

    private final byte[] bf(byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
        java.lang.String str = (java.lang.String) this.a;
        javax.crypto.Mac mac = (javax.crypto.Mac) ajse.b.a(str);
        if (i > mac.getMacLength() * 255) {
            throw new java.security.GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i];
        mac.init(new javax.crypto.spec.SecretKeySpec(bArr, str));
        byte[] bArrDoFinal = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            mac.update((byte) i2);
            bArrDoFinal = mac.doFinal();
            int length = bArrDoFinal.length;
            int i4 = i3 + length;
            if (i4 >= i) {
                java.lang.System.arraycopy(bArrDoFinal, 0, bArr3, i3, i - i3);
                return bArr3;
            }
            java.lang.System.arraycopy(bArrDoFinal, 0, bArr3, i3, length);
            i2++;
            i3 = i4;
        }
    }

    private final byte[] bg(byte[] bArr, byte[] bArr2) throws java.security.InvalidKeyException {
        java.lang.String str = (java.lang.String) this.a;
        javax.crypto.Mac mac = (javax.crypto.Mac) ajse.b.a(str);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new javax.crypto.spec.SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new javax.crypto.spec.SecretKeySpec(bArr2, str));
        }
        return mac.doFinal(bArr);
    }

    public final /* synthetic */ defpackage.akpz C() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akpz) aladVarP;
    }

    public final void D(defpackage.akqd akqdVar) {
        aooh.f(akqdVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akpz akpzVar = (defpackage.akpz) akzxVar.b;
        defpackage.akpz akpzVar2 = defpackage.akpz.a;
        j$.util.Objects.requireNonNull(akqdVar);
        akpzVar.c = akqdVar;
        akpzVar.b = 2;
    }

    public final /* synthetic */ defpackage.akou E() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akou) aladVarP;
    }

    public final void F(defpackage.akov akovVar) {
        aooh.f(akovVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akou akouVar = (defpackage.akou) akzxVar.b;
        defpackage.akou akouVar2 = defpackage.akou.a;
        j$.util.Objects.requireNonNull(akovVar);
        akouVar.c = akovVar;
        akouVar.b |= 2;
    }

    public final /* synthetic */ defpackage.akos G() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akos) aladVarP;
    }

    public final void H(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akos akosVar = (defpackage.akos) akzxVar.b;
        defpackage.akos akosVar2 = defpackage.akos.a;
        akosVar.c = i - 1;
        akosVar.b |= 1;
    }

    public final /* synthetic */ defpackage.aklo I() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.aklo) aladVarP;
    }

    public final void J(defpackage.aklm aklmVar) {
        aooh.f(aklmVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.aklo akloVar = (defpackage.aklo) akzxVar.b;
        defpackage.aklo akloVar2 = defpackage.aklo.a;
        j$.util.Objects.requireNonNull(aklmVar);
        akloVar.d = aklmVar;
        akloVar.b |= 8;
    }

    public final void K(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.aklo akloVar = (defpackage.aklo) akzxVar.b;
        defpackage.aklo akloVar2 = defpackage.aklo.a;
        akloVar.c = i - 2;
        akloVar.b |= 1;
    }

    public final /* synthetic */ defpackage.akln L() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akln) aladVarP;
    }

    public final void M(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akln aklnVar = (defpackage.akln) akzxVar.b;
        defpackage.akln aklnVar2 = defpackage.akln.a;
        aklnVar.c = i - 1;
        aklnVar.b |= 1;
    }

    public final /* synthetic */ defpackage.aklm N() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.aklm) aladVarP;
    }

    public final /* synthetic */ defpackage.aklk O() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.aklk) aladVarP;
    }

    public final void P(defpackage.akll akllVar) {
        aooh.f(akllVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.aklk aklkVar = (defpackage.aklk) akzxVar.b;
        defpackage.aklk aklkVar2 = defpackage.aklk.a;
        j$.util.Objects.requireNonNull(akllVar);
        aklkVar.d = akllVar;
        aklkVar.b |= 2;
    }

    public final void Q(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.aklk aklkVar = (defpackage.aklk) akzxVar.b;
        defpackage.aklk aklkVar2 = defpackage.aklk.a;
        aklkVar.c = i - 1;
        aklkVar.b |= 1;
    }

    public final /* synthetic */ defpackage.akll R() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akll) aladVarP;
    }

    public final /* synthetic */ defpackage.aklj S() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.aklj) aladVarP;
    }

    public final void T(defpackage.akli akliVar) {
        aooh.f(akliVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.aklj akljVar = (defpackage.aklj) akzxVar.b;
        defpackage.aklj akljVar2 = defpackage.aklj.a;
        j$.util.Objects.requireNonNull(akliVar);
        akljVar.c = akliVar;
        akljVar.b |= 4;
    }

    public final /* synthetic */ defpackage.akli U() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akli) aladVarP;
    }

    public final void V(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akli akliVar = (defpackage.akli) akzxVar.b;
        defpackage.akli akliVar2 = defpackage.akli.a;
        j$.util.Objects.requireNonNull(str);
        akliVar.b |= 1;
        akliVar.c = str;
    }

    public final /* synthetic */ defpackage.akle W() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akle) aladVarP;
    }

    public final void X(defpackage.aklj akljVar) {
        aooh.f(akljVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akle akleVar = (defpackage.akle) akzxVar.b;
        defpackage.akle akleVar2 = defpackage.akle.a;
        j$.util.Objects.requireNonNull(akljVar);
        akleVar.c = akljVar;
        akleVar.b |= 1;
    }

    public final void Y(defpackage.aklk aklkVar) {
        aooh.f(aklkVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akle akleVar = (defpackage.akle) akzxVar.b;
        defpackage.akle akleVar2 = defpackage.akle.a;
        j$.util.Objects.requireNonNull(aklkVar);
        akleVar.e = aklkVar;
        akleVar.b |= 4;
    }

    public final void Z(defpackage.aklj akljVar) {
        aooh.f(akljVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akle akleVar = (defpackage.akle) akzxVar.b;
        defpackage.akle akleVar2 = defpackage.akle.a;
        j$.util.Objects.requireNonNull(akljVar);
        akleVar.d = akljVar;
        akleVar.b |= 2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final void a(java.nio.ByteBuffer byteBuffer) {
        ?? r1 = this.a;
        if (r1.isEmpty() || r1.get(r1.size() - 1) != byteBuffer) {
            r1.add(byteBuffer);
        }
    }

    public final /* synthetic */ defpackage.amjs aA() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.amjs) aladVarP;
    }

    public final void aB(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amjs amjsVar = (defpackage.amjs) akzxVar.b;
        defpackage.amjs amjsVar2 = defpackage.amjs.a;
        amjsVar.b |= 1;
        amjsVar.c = f;
    }

    public final void aC(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amjs amjsVar = (defpackage.amjs) akzxVar.b;
        defpackage.amjs amjsVar2 = defpackage.amjs.a;
        amjsVar.b |= 2;
        amjsVar.d = f;
    }

    public final void aD(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amjs amjsVar = (defpackage.amjs) akzxVar.b;
        defpackage.amjs amjsVar2 = defpackage.amjs.a;
        amjsVar.b |= 4;
        amjsVar.e = f;
    }

    public final /* synthetic */ defpackage.amjr aE() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.amjr) aladVarP;
    }

    public final void aF(amml ammlVar) {
        aooh.f(ammlVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amjr amjrVar = (defpackage.amjr) akzxVar.b;
        defpackage.amjr amjrVar2 = defpackage.amjr.a;
        j$.util.Objects.requireNonNull(ammlVar);
        amjrVar.c = ammlVar;
        amjrVar.b |= 1;
    }

    public final void aG(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amjr amjrVar = (defpackage.amjr) akzxVar.b;
        defpackage.amjr amjrVar2 = defpackage.amjr.a;
        amjrVar.b |= 16;
        amjrVar.g = i;
    }

    public final void aH(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amjr amjrVar = (defpackage.amjr) akzxVar.b;
        defpackage.amjr amjrVar2 = defpackage.amjr.a;
        amjrVar.b |= 32;
        amjrVar.h = f;
    }

    public final void aI(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amjr amjrVar = (defpackage.amjr) akzxVar.b;
        defpackage.amjr amjrVar2 = defpackage.amjr.a;
        amjrVar.b |= 2;
        amjrVar.d = f;
    }

    public final void aJ(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amjr amjrVar = (defpackage.amjr) akzxVar.b;
        defpackage.amjr amjrVar2 = defpackage.amjr.a;
        amjrVar.b |= 8;
        amjrVar.f = i;
    }

    public final void aK(float f) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amjr amjrVar = (defpackage.amjr) akzxVar.b;
        defpackage.amjr amjrVar2 = defpackage.amjr.a;
        amjrVar.b |= 4;
        amjrVar.e = f;
    }

    public final /* synthetic */ defpackage.amjn aL() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.amjn) aladVarP;
    }

    public final void aM(defpackage.amjs amjsVar) {
        aooh.f(amjsVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amjn amjnVar = (defpackage.amjn) akzxVar.b;
        defpackage.amjn amjnVar2 = defpackage.amjn.a;
        j$.util.Objects.requireNonNull(amjsVar);
        amjnVar.c = amjsVar;
        amjnVar.b = 1;
    }

    public final /* synthetic */ defpackage.amgy aN() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.amgy) aladVarP;
    }

    public final void aO(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amgy amgyVar = (defpackage.amgy) akzxVar.b;
        defpackage.amgy amgyVar2 = defpackage.amgy.a;
        j$.util.Objects.requireNonNull(str);
        amgyVar.b |= 1;
        amgyVar.c = str;
    }

    public final void aP(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amgy amgyVar = (defpackage.amgy) akzxVar.b;
        defpackage.amgy amgyVar2 = defpackage.amgy.a;
        amgyVar.f = i - 2;
        amgyVar.b |= 64;
    }

    public final void aQ(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amgy amgyVar = (defpackage.amgy) akzxVar.b;
        defpackage.amgy amgyVar2 = defpackage.amgy.a;
        amgyVar.e = i - 1;
        amgyVar.b |= 32;
    }

    public final void aR() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amgy amgyVar = (defpackage.amgy) akzxVar.b;
        defpackage.amgy amgyVar2 = defpackage.amgy.a;
        amgyVar.d = 0;
        amgyVar.b |= 2;
    }

    public final /* synthetic */ defpackage.alwn aS() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.alwn) aladVarP;
    }

    public final void aT(defpackage.alxe alxeVar) {
        aooh.f(alxeVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alwn alwnVar = (defpackage.alwn) akzxVar.b;
        defpackage.alwn alwnVar2 = defpackage.alwn.a;
        j$.util.Objects.requireNonNull(alxeVar);
        alwnVar.i = alxeVar;
        alwnVar.b |= 256;
    }

    public final void aU(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alwn alwnVar = (defpackage.alwn) akzxVar.b;
        defpackage.alwn alwnVar2 = defpackage.alwn.a;
        j$.util.Objects.requireNonNull(str);
        alwnVar.b |= 4096;
        alwnVar.m = str;
    }

    public final void aV(defpackage.alxj alxjVar) {
        aooh.f(alxjVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alwn alwnVar = (defpackage.alwn) akzxVar.b;
        defpackage.alwn alwnVar2 = defpackage.alwn.a;
        j$.util.Objects.requireNonNull(alxjVar);
        alwnVar.e = alxjVar;
        alwnVar.b |= 16;
    }

    public final void aW() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alwn alwnVar = (defpackage.alwn) akzxVar.b;
        defpackage.alwn alwnVar2 = defpackage.alwn.a;
        alwnVar.b |= 8;
        alwnVar.d = true;
    }

    public final void aX() {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alwn alwnVar = (defpackage.alwn) akzxVar.b;
        defpackage.alwn alwnVar2 = defpackage.alwn.a;
        alwnVar.k = 2;
        alwnVar.b |= 1024;
    }

    public final /* synthetic */ defpackage.alwf aY() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.alwf) aladVarP;
    }

    public final void aZ(java.lang.String str) {
        aooh.f(str, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alwf alwfVar = (defpackage.alwf) akzxVar.b;
        defpackage.alwf alwfVar2 = defpackage.alwf.a;
        j$.util.Objects.requireNonNull(str);
        alwfVar.b |= 1;
        alwfVar.c = str;
    }

    public final void aa(defpackage.aklo akloVar) {
        aooh.f(akloVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akle akleVar = (defpackage.akle) akzxVar.b;
        defpackage.akle akleVar2 = defpackage.akle.a;
        j$.util.Objects.requireNonNull(akloVar);
        akleVar.f = akloVar;
        akleVar.b |= 8;
    }

    public final /* synthetic */ defpackage.akld ab() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akld) aladVarP;
    }

    public final /* synthetic */ void ac(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akld akldVar = (defpackage.akld) akzxVar.b;
        defpackage.akld akldVar2 = defpackage.akld.a;
        akldVar.b();
        akldVar.b.g(i);
    }

    public final /* synthetic */ void ad() {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.akld) ((akzx) this.a).b).b);
        aooh.e(listUnmodifiableList, "getResourceIdsList(...)");
        new alct(listUnmodifiableList);
    }

    public final /* synthetic */ defpackage.akku ae() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akku) aladVarP;
    }

    public final void af(akzc akzcVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akku akkuVar = (defpackage.akku) akzxVar.b;
        defpackage.akku akkuVar2 = defpackage.akku.a;
        j$.util.Objects.requireNonNull(akzcVar);
        akkuVar.e = akzcVar;
    }

    public final void ag(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akku akkuVar = (defpackage.akku) akzxVar.b;
        defpackage.akku akkuVar2 = defpackage.akku.a;
        akkuVar.d = a.S(i);
    }

    public final /* synthetic */ defpackage.akig ah() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akig) aladVarP;
    }

    public final void ai(java.lang.String str) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akig akigVar = (defpackage.akig) akzxVar.b;
        alal alalVar = defpackage.akig.a;
        j$.util.Objects.requireNonNull(str);
        akigVar.d |= 64;
        akigVar.j = str;
    }

    public final void aj(akzm akzmVar) {
        aooh.f(akzmVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akig akigVar = (defpackage.akig) akzxVar.b;
        alal alalVar = defpackage.akig.a;
        j$.util.Objects.requireNonNull(akzmVar);
        akigVar.A = akzmVar;
        akigVar.d |= 67108864;
    }

    public final void ak(defpackage.akia akiaVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akig akigVar = (defpackage.akig) akzxVar.b;
        alal alalVar = defpackage.akig.a;
        j$.util.Objects.requireNonNull(akiaVar);
        akigVar.t = akiaVar;
        akigVar.d |= 131072;
    }

    public final void al(defpackage.akib akibVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akig akigVar = (defpackage.akig) akzxVar.b;
        alal alalVar = defpackage.akig.a;
        akigVar.o = akibVar.H;
        akigVar.d |= 512;
    }

    public final void am(defpackage.akqp akqpVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akig akigVar = (defpackage.akig) akzxVar.b;
        alal alalVar = defpackage.akig.a;
        j$.util.Objects.requireNonNull(akqpVar);
        akigVar.v = akqpVar;
        akigVar.d |= 524288;
    }

    public final void an(defpackage.akif akifVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akig akigVar = (defpackage.akig) akzxVar.b;
        alal alalVar = defpackage.akig.a;
        akigVar.q = akifVar.f;
        akigVar.d |= 2048;
    }

    public final void ao(long j) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akig akigVar = (defpackage.akig) akzxVar.b;
        alal alalVar = defpackage.akig.a;
        akigVar.d |= 4096;
        akigVar.r = j;
    }

    public final void ap(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akig akigVar = (defpackage.akig) akzxVar.b;
        alal alalVar = defpackage.akig.a;
        akigVar.w = i - 1;
        akigVar.d |= 1048576;
    }

    public final /* synthetic */ defpackage.akhw aq() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akhw) aladVarP;
    }

    public final void ar(defpackage.akgv akgvVar) {
        aooh.f(akgvVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akhw akhwVar = (defpackage.akhw) akzxVar.b;
        defpackage.akhw akhwVar2 = defpackage.akhw.a;
        akhwVar.d = akgvVar.a();
        akhwVar.b |= 8;
    }

    public final void as(akgw akgwVar) {
        aooh.f(akgwVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akhw akhwVar = (defpackage.akhw) akzxVar.b;
        defpackage.akhw akhwVar2 = defpackage.akhw.a;
        akhwVar.c = akgwVar.a();
        akhwVar.b |= 4;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aoin, java.lang.Object] */
    public final boolean at() {
        return ((apnt) this.a.a()).b("com.google.android.dialer.directboot", "45775450").e();
    }

    public final /* synthetic */ amtr au() {
        amtr amtrVarP = ((akzx) this.a).p();
        aooh.e(amtrVarP, "build(...)");
        return amtrVarP;
    }

    public final /* synthetic */ amsu av() {
        amsu amsuVarP = ((akzx) this.a).p();
        aooh.e(amsuVarP, "build(...)");
        return amsuVarP;
    }

    public final /* synthetic */ defpackage.amsv aw() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.amsv) aladVarP;
    }

    public final void ax(akzm akzmVar) {
        aooh.f(akzmVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amsv amsvVar = (defpackage.amsv) akzxVar.b;
        defpackage.amsv amsvVar2 = defpackage.amsv.a;
        j$.util.Objects.requireNonNull(akzmVar);
        amsvVar.d = akzmVar;
        amsvVar.b |= 2;
    }

    public final void ay(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amsv amsvVar = (defpackage.amsv) akzxVar.b;
        defpackage.amsv amsvVar2 = defpackage.amsv.a;
        amsvVar.b |= 1;
        amsvVar.c = z;
    }

    public final void az(amsu amsuVar) {
        aooh.f(amsuVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.amsv amsvVar = (defpackage.amsv) akzxVar.b;
        defpackage.amsv amsvVar2 = defpackage.amsv.a;
        j$.util.Objects.requireNonNull(amsuVar);
        amsvVar.e = amsuVar;
        amsvVar.b |= 4;
    }

    public final java.util.regex.Pattern b(java.lang.String str) {
        amwp amwpVar = (amwp) this.a;
        java.util.regex.Pattern pattern = (java.util.regex.Pattern) amwpVar.e(str);
        if (pattern != null) {
            return pattern;
        }
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(str);
        amwpVar.f(str, patternCompile);
        return patternCompile;
    }

    public final /* synthetic */ defpackage.alro ba() {
        defpackage.alro alroVarP = ((akzx) this.a).p();
        aooh.e(alroVarP, "build(...)");
        return alroVarP;
    }

    public final void bb(long j) {
        java.lang.Object obj = this.a;
        ((akzx) obj).u();
        defpackage.alro alroVar = ((akzz) obj).b;
        defpackage.alro alroVar2 = defpackage.alro.a;
        alroVar.b |= 1;
        alroVar.c = j;
    }

    public final /* synthetic */ defpackage.alrm bc() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.alrm) aladVarP;
    }

    public final void bd(defpackage.alrk alrkVar) {
        aooh.f(alrkVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.alrm alrmVar = (defpackage.alrm) akzxVar.b;
        defpackage.alrm alrmVar2 = defpackage.alrm.a;
        j$.util.Objects.requireNonNull(alrkVar);
        alrmVar.c = alrkVar;
        alrmVar.b = 2;
    }

    public final /* synthetic */ void be(apdi apdiVar, java.lang.Object obj) {
        aooh.f(apdiVar, "extension");
        aooh.f(obj, "value");
        ((akzz) this.a).bV(apdiVar, obj);
    }

    public final /* synthetic */ defpackage.akhu c() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akhu) aladVarP;
    }

    public final void d(defpackage.akig akigVar) {
        aooh.f(akigVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akhu akhuVar = (defpackage.akhu) akzxVar.b;
        defpackage.akhu akhuVar2 = defpackage.akhu.a;
        j$.util.Objects.requireNonNull(akigVar);
        akhuVar.j = akigVar;
        akhuVar.c |= 2;
    }

    public final /* synthetic */ defpackage.akhi e() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.akhi) aladVarP;
    }

    public final void f(alcf alcfVar) {
        aooh.f(alcfVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akhi akhiVar = (defpackage.akhi) akzxVar.b;
        defpackage.akhi akhiVar2 = defpackage.akhi.a;
        j$.util.Objects.requireNonNull(alcfVar);
        akhiVar.e = alcfVar;
        akhiVar.b |= 2;
    }

    public final void g(defpackage.akhq akhqVar) {
        aooh.f(akhqVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akhi akhiVar = (defpackage.akhi) akzxVar.b;
        defpackage.akhi akhiVar2 = defpackage.akhi.a;
        j$.util.Objects.requireNonNull(akhqVar);
        akhiVar.c = akhqVar;
        akhiVar.b |= 1;
    }

    public final void h(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.akhi akhiVar = (defpackage.akhi) akzxVar.b;
        defpackage.akhi akhiVar2 = defpackage.akhi.a;
        akhiVar.d = defpackage.akky.d(i);
    }

    public final /* synthetic */ akhf i() {
        akhf akhfVarP = ((akzx) this.a).p();
        aooh.e(akhfVarP, "build(...)");
        return akhfVarP;
    }

    public final int j() {
        return ((ajst) this.a).a();
    }

    public final byte[] k() {
        return ((ajst) this.a).c();
    }

    public final int l() {
        return javax.crypto.Mac.getInstance((java.lang.String) this.a).getMacLength();
    }

    public final byte[] m() throws java.security.GeneralSecurityException {
        java.lang.String str = (java.lang.String) this.a;
        int iHashCode = str.hashCode();
        if (iHashCode != 984523022) {
            if (iHashCode != 984524074) {
                if (iHashCode == 984525777 && str.equals("HmacSha512")) {
                    return ajks.h;
                }
            } else if (str.equals("HmacSha384")) {
                return ajks.g;
            }
        } else if (str.equals("HmacSha256")) {
            return ajks.f;
        }
        throw new java.security.GeneralSecurityException("Could not determine HPKE KDF ID");
    }

    public final byte[] n(byte[] bArr, byte[] bArr2, java.lang.String str, byte[] bArr3, int i) {
        return bf(bArr, ajks.f(str, bArr2, bArr3, i), i);
    }

    public final byte[] o(byte[] bArr, byte[] bArr2, java.lang.String str, byte[] bArr3) {
        return bg(ajks.e(str, bArr2, bArr3), bArr);
    }

    public final byte[] p(byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        return bf(bg(ajks.e("eae_prk", bArr, bArr3), null), ajks.f("shared_secret", bArr2, bArr3, i), i);
    }

    public final long q() {
        return ((ahzh) this.a).a(java.util.concurrent.TimeUnit.MICROSECONDS);
    }

    public final /* synthetic */ defpackage.aiyd r() {
        alad aladVarP = ((akzx) this.a).p();
        aooh.e(aladVarP, "build(...)");
        return (defpackage.aiyd) aladVarP;
    }

    public final void s(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.aiyd aiydVar = (defpackage.aiyd) akzxVar.b;
        defpackage.aiyd aiydVar2 = defpackage.aiyd.a;
        aiydVar.c = i - 1;
        aiydVar.b |= 1;
    }

    public final void t(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.aiyd aiydVar = (defpackage.aiyd) akzxVar.b;
        defpackage.aiyd aiydVar2 = defpackage.aiyd.a;
        aiydVar.d = i - 1;
        aiydVar.b |= 2;
    }

    public final void u(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        defpackage.aiyd aiydVar = (defpackage.aiyd) akzxVar.b;
        defpackage.aiyd aiydVar2 = defpackage.aiyd.a;
        aiydVar.e = i - 1;
        aiydVar.b |= 4;
    }

    public final /* synthetic */ aiye v() {
        aiye aiyeVarP = ((akzx) this.a).p();
        aooh.e(aiyeVarP, "build(...)");
        return aiyeVarP;
    }

    public final void w(nvq nvqVar) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aiye aiyeVar = akzxVar.b;
        alal alalVar = aiye.a;
        aiyeVar.h = nvqVar.e;
        aiyeVar.c |= 8;
    }

    public final void x(boolean z) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aiye aiyeVar = akzxVar.b;
        alal alalVar = aiye.a;
        aiyeVar.c |= 64;
        aiyeVar.m = z;
    }

    public final void y(defpackage.aiyd aiydVar) {
        aooh.f(aiydVar, "value");
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aiye aiyeVar = akzxVar.b;
        alal alalVar = aiye.a;
        j$.util.Objects.requireNonNull(aiydVar);
        aiyeVar.f = aiydVar;
        aiyeVar.c |= 2;
    }

    public final void z(int i) {
        akzx akzxVar = (akzx) this.a;
        akzxVar.u();
        aiye aiyeVar = akzxVar.b;
        alal alalVar = aiye.a;
        aiyeVar.i = i - 1;
        aiyeVar.c |= 16;
    }

    public ajyi(java.lang.Object obj) {
        this.a = obj;
    }

    public ajyi() {
        this.a = new java.util.ArrayList();
    }

    public ajyi(aoin aoinVar) {
        this.a = aoinVar;
    }

    public ajyi(int i) {
        this.a = new amwp(i);
    }
}
