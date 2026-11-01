package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class jhx implements aoin {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;

    public /* synthetic */ jhx(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, zit] */
    /* JADX WARN: Type inference failed for: r7v10, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, zit] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, zit] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.lang.Object, zim] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, zit] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, rlv] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, zim] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, zit] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, zit] */
    /* JADX WARN: Type inference failed for: r7v8, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [aoin, java.lang.Object] */
    public final java.lang.Object a() {
        xas jouVar;
        ahnv ahnvVar;
        switch (this.$cid) {
            case 0:
                return this.a.a(new gbp(this.b, 6, (float[]) null));
            case 1:
                return this.a.a(new gbp(this.b, 8, (float[]) null));
            case 2:
                jouVar = new defpackage.jou(this.a, (aogc) this.b);
                break;
            case 3:
                jouVar = new defpackage.kxf(this.a, (aogc) this.b);
                break;
            case 4:
                return this.a.a(new gbp(this.b, 11, (boolean[][]) null));
            case 5:
                return this.a.a(new gbp(this.b, 15, (int[][][]) null));
            case 6:
                return this.a.a(new gbp(this.b, 16, (int[][][]) null));
            case 7:
                jouVar = new rew((aoin) this.b, (aoin) this.a, 1);
                break;
            case 8:
                jouVar = new rew((aoin) this.b, (aoin) this.a, 0);
                break;
            case 9:
                jouVar = new rew((aoin) this.b, (aoin) this.a, 2);
                break;
            case 10:
                return afsq.co((aoin) this.a, (rfa) this.b);
            case 11:
                return afsq.co((aoin) this.a, (rfa) this.b);
            case 12:
                return afsq.co((aoin) this.a, (rfa) this.b);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                jouVar = new uaz((rlv) this.a, (aogc) this.b);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return this.a.a(new sba(this.b, 9, (short[][]) null));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return this.a.a(new sba(this.b, 11, (short[][]) null));
            case 16:
                return this.a.a(new sba(this.b, 10, (int[][]) null));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                jouVar = new xas((rlv) this.a, (aogc) this.b);
                break;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                int iJ = wsc.j(((xdh) this.a.a()).c.c);
                if (iJ == 0) {
                    throw null;
                }
                int i = iJ - 1;
                return (i == 3 || i == 4 || i == 5 || i == 6) ? j$.util.Optional.of(new aprf(this.b, (byte[]) null)) : j$.util.Optional.empty();
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ?? r0 = this.a;
                if (ahns.q()) {
                    ahnvVar = new ahnv(0);
                } else {
                    ahns.n();
                    ahnvVar = ahns.q() ? new ahnv(2) : new ahmv(((ahpz) ((uzx) ((uzx) this.b).a).a).g(1425, "GlideApp.with"), 4);
                }
                try {
                    ahpm ahpmVarG = ahns.g();
                    try {
                        java.lang.Object objA = r0.a();
                        ahpmVarG.close();
                        ahnvVar.close();
                        return objA;
                    } catch (java.lang.Throwable th) {
                        try {
                            ahpmVarG.close();
                            break;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    try {
                        ahnvVar.close();
                        break;
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            default:
                ?? r1 = this.a;
                ahpi ahpiVarD = ((ahpz) this.b).d(1473, "Create gRPC Service Impl ".concat(java.lang.String.valueOf((java.lang.String) r1.getKey())), ahot.a);
                try {
                    anlx anlxVar = (anlx) ((aoin) r1.getValue()).a();
                    ahpiVarD.close();
                    return anlxVar;
                } catch (java.lang.Throwable th5) {
                    try {
                        ahpiVarD.close();
                        break;
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
        }
        return jouVar;
    }

    public /* synthetic */ jhx(java.lang.Object obj, java.lang.Object obj2, int i, byte[] bArr) {
        this.$cid = i;
        this.b = obj;
        this.a = obj2;
    }
}
