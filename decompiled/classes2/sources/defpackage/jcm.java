package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jcm extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ boolean a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcm(abgq abgqVar, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = abgqVar;
        this.a = z;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 1:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 2:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 3:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 4:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 5:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 6:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 7:
                c((aoss) obj, (aoln) obj2).b(aojh.a);
                return null;
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    public final java.lang.Object b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aooc.af(obj);
                boolean z = this.a;
                defpackage.jbv jbvVar = ((defpackage.jcp) this.b).f;
                jbvVar.m.s(aosv.F(jbvVar.b, 0, new defpackage.jbu(jbvVar, z, (aoln) null, 0), 3), defpackage.jcc.a);
                return aojh.a;
            case 1:
                aooc.af(obj);
                android.content.Context context = ((hmd) this.b).c;
                android.content.ComponentName componentName = new android.content.ComponentName(context, (java.lang.Class<?>) com.android.dialer.androidauto.impl.carservice.DialerCarAppService.class);
                aimw aimwVarL = hmd.a.b().l("com/android/dialer/androidauto/impl/carservice/DialerCarAppServiceStateUpdater", "updateCarAppServicePackageState$<anonymous>", 95, "DialerCarAppServiceStateUpdater.kt");
                boolean z2 = this.a;
                aimwVarL.y("Setting CarAppService enabled state to %s", java.lang.Boolean.valueOf(z2));
                context.getPackageManager().setComponentEnabledSetting(componentName, true == z2 ? 1 : 2, 1);
                return aojh.a;
            case 2:
                aooc.af(obj);
                ((defpackage.lrc) this.b).f = java.lang.Boolean.valueOf(this.a);
                return aojh.a;
            case 3:
                aooc.af(obj);
                ((defpackage.ofc) this.b).c = this.a;
                return aojh.a;
            case 4:
                aooc.af(obj);
                boolean z3 = this.a;
                oju ojuVar = (oju) this.b;
                ojuVar.f.setBluetoothScoOn(z3);
                zjv.i(ojuVar.d, mgv.dA, ajsz.aY(gus.ax(z3)), (mhc) null, 0, 28);
                return aojh.a;
            case 5:
                aooc.af(obj);
                boolean z4 = this.a;
                oju ojuVar2 = (oju) this.b;
                ojuVar2.f.setSpeakerphoneOn(z4);
                zjv.i(ojuVar2.d, mgv.dO, ajsz.aY(gus.ax(z4)), (mhc) null, 0, 28);
                return aojh.a;
            case 6:
                aooc.af(obj);
                if (this.a && aooh.q((j$.util.Optional) this.b) == pzp.d) {
                    j$.util.Optional optionalOf = j$.util.Optional.of(pdw.b);
                    aooh.e(optionalOf, "of(...)");
                    return optionalOf;
                }
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                aooh.e(optionalEmpty, "empty(...)");
                return optionalEmpty;
            case 7:
                aooc.af(obj);
                android.content.Context context2 = ((vji) this.b).a;
                context2.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context2, (java.lang.Class<?>) com.android.dialer.voicemail.service.impl.sms.receiver.AdnMessageReceiver_Receiver.class), true == this.a ? 1 : 2, 1);
                return null;
            case 8:
                aooc.af(obj);
                vvz vvzVar = (vvz) this.b;
                vvr vvrVar = vvzVar.i;
                boolean z5 = vvrVar.c;
                boolean z6 = this.a;
                if (z6 != z5) {
                    vvzVar.i = vvr.a(vvrVar, false, 0, z6, 3);
                    ((ipc) vvzVar.m.g().orElseThrow()).aS();
                }
                return aojh.a;
            default:
                aooc.af(obj);
                boolean z7 = this.a;
                abgq abgqVar = (abgq) this.b;
                abgqVar.i = z7;
                if (!z7) {
                    aoov.an(abgqVar.a, (aolr) null, 0, new abgk(abgqVar, (aoln) null, 16, (int[][][]) null), 3);
                }
                return aojh.a;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        defpackage.jcm jcmVar;
        switch (this.$cid) {
            case 0:
                jcmVar = new defpackage.jcm((defpackage.jcp) this.b, this.a, aolnVar, 0);
                break;
            case 1:
                jcmVar = new defpackage.jcm((hmd) this.b, this.a, aolnVar, 1);
                break;
            case 2:
                jcmVar = new defpackage.jcm((defpackage.lrc) this.b, this.a, aolnVar, 2);
                break;
            case 3:
                jcmVar = new defpackage.jcm((defpackage.ofc) this.b, this.a, aolnVar, 3);
                break;
            case 4:
                jcmVar = new defpackage.jcm((oju) this.b, this.a, aolnVar, 4);
                break;
            case 5:
                return new defpackage.jcm((oju) this.b, this.a, aolnVar, 5, null);
            case 6:
                return new defpackage.jcm(this.a, (j$.util.Optional) this.b, aolnVar, 6);
            case 7:
                return new defpackage.jcm(this.a, (vji) this.b, aolnVar, 7);
            case 8:
                return new defpackage.jcm(this.a, (vvz) this.b, aolnVar, 8);
            default:
                jcmVar = new defpackage.jcm((abgq) this.b, this.a, aolnVar, 9);
                break;
        }
        return jcmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcm(hmd hmdVar, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = hmdVar;
        this.a = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcm(defpackage.jcp jcpVar, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = jcpVar;
        this.a = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcm(defpackage.lrc lrcVar, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = lrcVar;
        this.a = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcm(defpackage.ofc ofcVar, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ofcVar;
        this.a = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcm(oju ojuVar, boolean z, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ojuVar;
        this.a = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcm(oju ojuVar, boolean z, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ojuVar;
        this.a = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcm(boolean z, j$.util.Optional optional, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = z;
        this.b = optional;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcm(boolean z, vji vjiVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = z;
        this.b = vjiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jcm(boolean z, vvz vvzVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = z;
        this.b = vvzVar;
    }
}
