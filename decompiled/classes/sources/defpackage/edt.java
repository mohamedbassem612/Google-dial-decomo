package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class edt extends defpackage.aomh implements defpackage.aonj {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edt(defpackage.eei eeiVar, defpackage.aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = eeiVar;
    }

    @Override // defpackage.aonj
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            return new defpackage.edt((defpackage.eei) this.b, (defpackage.aoln) obj, 0).b(defpackage.aojh.a);
        }
        if (i == 1) {
            return new defpackage.edt((defpackage.eei) this.b, (defpackage.aoln) obj, 1, (byte[]) null).b(defpackage.aojh.a);
        }
        if (i == 2) {
            return new defpackage.edt((defpackage.okw) this.b, (defpackage.aoln) obj, 2).b(defpackage.aojh.a);
        }
        if (i == 3) {
            return new defpackage.edt((defpackage.okw) this.b, (defpackage.aoln) obj, 3, (byte[]) null).b(defpackage.aojh.a);
        }
        if (i == 4) {
            return new defpackage.edt((defpackage.oru) this.b, (defpackage.aoln) obj, 4).b(defpackage.aojh.a);
        }
        if (i != 5) {
            return new defpackage.edt((defpackage.tmi) this.b, (defpackage.aoln) obj, 6).b(defpackage.aojh.a);
        }
        return new defpackage.edt((defpackage.tle) this.b, (defpackage.aoln) obj, 5).b(defpackage.aojh.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r7 != r0) goto L27;
     */
    @Override // defpackage.aomb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edt.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edt(defpackage.eei eeiVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = eeiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edt(defpackage.okw okwVar, defpackage.aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = okwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edt(defpackage.okw okwVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = okwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edt(defpackage.oru oruVar, defpackage.aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = oruVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edt(defpackage.tle tleVar, defpackage.aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tleVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edt(defpackage.tmi tmiVar, defpackage.aoln aolnVar, int i) {
        super(1, aolnVar);
        this.$cid = i;
        this.b = tmiVar;
    }
}
