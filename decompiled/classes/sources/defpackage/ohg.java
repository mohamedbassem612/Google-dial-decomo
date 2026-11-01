package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ohg extends defpackage.aomh implements defpackage.aonn {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(oft oftVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = oftVar;
    }

    @Override // defpackage.aonn
    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.$cid) {
            case 0:
                ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
                return null;
            case 1:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 2:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 3:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 4:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 5:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 9:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 10:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 11:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 12:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 13:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 14:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 15:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 16:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 17:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 18:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            case 19:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
            default:
                return ((defpackage.ohg) c((defpackage.aoss) obj, (defpackage.aoln) obj2)).b(defpackage.aojh.a);
        }
    }

    @Override // defpackage.aomb
    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Integer num;
        switch (this.$cid) {
            case 0:
                defpackage.aooc.af(obj);
                ohi ohiVar = (ohi) this.a;
                ohiVar.h = true;
                ohb ohbVar = ohiVar.k;
                ohb ohbVar2 = ohb.a;
                if (ohi.g(ohbVar, ohbVar2)) {
                    ohiVar.k = ohbVar2;
                }
                return null;
            case 1:
                defpackage.aooc.af(obj);
                oft oftVar = (oft) this.a;
                oftVar.e = true;
                if (!oftVar.d) {
                    return defpackage.aojh.a;
                }
                int i = oftVar.f;
                if (i != -1) {
                    oftVar.c.setStreamVolume(2, i, 0);
                    ogj ogjVar = oftVar.h;
                    if (ogjVar != null) {
                        ogjVar.f();
                    }
                    oftVar.f = -1;
                }
                oftVar.d = false;
                return defpackage.aojh.a;
            case 2:
                defpackage.aooc.af(obj);
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                defpackage.aooh.e(optionalEmpty, "empty(...)");
                ((tpf) this.a).d = optionalEmpty;
                return defpackage.aojh.a;
            case 3:
                defpackage.aooc.af(obj);
                return ((tpf) this.a).d;
            case 4:
                defpackage.aooc.af(obj);
                num = new java.lang.Integer(((defpackage.tkl) this.a).j(0));
                break;
            case 5:
                defpackage.aooc.af(obj);
                defpackage.oju ojuVar = (defpackage.oju) this.a;
                mp$.ExternalSyntheticApiModelOutline0.m(ojuVar.f);
                defpackage.zjv.i(ojuVar.d, defpackage.mgv.AUDIO_MANAGER_CLEAR_COMMUNICATION_DEVICE, null, null, 0, 30);
                return defpackage.aojh.a;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aooc.af(obj);
                return ((defpackage.oju) this.a).h();
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aooc.af(obj);
                return ((defpackage.oju) this.a).i();
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aooc.af(obj);
                num = new java.lang.Integer(((defpackage.oju) this.a).b());
                break;
            case 9:
                defpackage.aooc.af(obj);
                defpackage.oju ojuVar2 = (defpackage.oju) this.a;
                java.lang.Object objF = new defpackage.mgf(ojuVar2.e, ojuVar2.f.isBluetoothScoOn()).a(defpackage.mgv.AUDIO_MANAGER_IS_BLUETOOTH_SCO_ON).f();
                defpackage.aooh.e(objF, "ifTrue(...)");
                java.lang.Boolean bool = (java.lang.Boolean) objF;
                bool.booleanValue();
                return bool;
            case 10:
                defpackage.aooc.af(obj);
                java.lang.Object obj2 = this.a;
                try {
                    ((defpackage.oju) obj2).f.startBluetoothSco();
                    defpackage.zjv.i(((defpackage.oju) obj2).d, defpackage.mgv.AUDIO_MANAGER_START_BLUETOOTH_SCO, null, null, 0, 30);
                    break;
                } catch (java.lang.SecurityException e) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.oju.a.d()).k(e).l("com/android/dialer/externals/androidapis/media/DialerAudioManager", "startBluetoothScoLegacy", 191, "DialerAudioManager.kt")).v("AudioManager.startBluetoothSco called without permission.");
                }
                return defpackage.aojh.a;
            case 11:
                defpackage.aooc.af(obj);
                java.lang.Object obj3 = this.a;
                try {
                    ((defpackage.oju) obj3).f.stopBluetoothSco();
                    defpackage.zjv.i(((defpackage.oju) obj3).d, defpackage.mgv.AUDIO_MANAGER_STOP_BLUETOOTH_SCO, null, null, 0, 30);
                    break;
                } catch (java.lang.SecurityException e2) {
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.oju.a.d()).k(e2).l("com/android/dialer/externals/androidapis/media/DialerAudioManager", "stopBluetoothScoLegacy", 220, "DialerAudioManager.kt")).v("AudioManager.stopBluetoothSco called without permission.");
                }
                return defpackage.aojh.a;
            case 12:
                defpackage.aooc.af(obj);
                return ((uss) this.a).o();
            case 13:
                defpackage.aooc.af(obj);
                defpackage.tkl tklVar = (defpackage.tkl) this.a;
                int iM = fn$.ExternalSyntheticApiModelOutline0.m((android.os.PowerManager) tklVar.c);
                java.lang.Object obj4 = tklVar.a;
                j$.util.Objects.requireNonNull(obj4);
                num = new java.lang.Integer(defpackage.gus.aD(defpackage.mgv.POWER_MANAGER_GET_CURRENT_THERMAL_STATUS, iM, (defpackage.mgu) obj4).f());
                break;
            case 14:
                defpackage.aooc.af(obj);
                return java.lang.Boolean.valueOf(((defpackage.tkl) this.a).h());
            case 15:
                defpackage.aooc.af(obj);
                return ((defpackage.okj) this.a).n();
            case 16:
                defpackage.aooc.af(obj);
                num = new java.lang.Integer(((defpackage.okj) this.a).a());
                break;
            case 17:
                defpackage.aooc.af(obj);
                defpackage.oko okoVar = (defpackage.oko) this.a;
                android.telephony.TelephonyManager telephonyManager = okoVar.j;
                defpackage.mgu mguVarH = okoVar.h();
                int iM2 = mp$.ExternalSyntheticApiModelOutline0.m(telephonyManager);
                j$.util.Objects.requireNonNull(mguVarH);
                num = new java.lang.Integer(defpackage.gus.aD(defpackage.mgv.TELEPHONY_GET_CALL_COMPOSER_STATUS, iM2, mguVarH).f());
                break;
            case 18:
                defpackage.aooc.af(obj);
                return (java.lang.Integer) defpackage.aooh.q(((defpackage.oko) this.a).r());
            case 19:
                defpackage.aooc.af(obj);
                return ((defpackage.oko) this.a).g();
            default:
                defpackage.aooc.af(obj);
                return ((defpackage.oko) this.a).S();
        }
        return num;
    }

    @Override // defpackage.aomb
    public final defpackage.aoln c(java.lang.Object obj, defpackage.aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.ohg((ohi) this.a, aolnVar, 0);
            case 1:
                return new defpackage.ohg((oft) this.a, aolnVar, 1);
            case 2:
                return new defpackage.ohg((tpf) this.a, aolnVar, 2);
            case 3:
                return new defpackage.ohg((tpf) this.a, aolnVar, 3, (byte[]) null);
            case 4:
                return new defpackage.ohg((defpackage.tkl) this.a, aolnVar, 4, (char[]) null);
            case 5:
                return new defpackage.ohg((defpackage.oju) this.a, aolnVar, 5);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.ohg((defpackage.oju) this.a, aolnVar, 6, (byte[]) null);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.ohg((defpackage.oju) this.a, aolnVar, 7, (char[]) null);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.ohg((defpackage.oju) this.a, aolnVar, 8, (short[]) null);
            case 9:
                return new defpackage.ohg((defpackage.oju) this.a, aolnVar, 9, (int[]) null);
            case 10:
                return new defpackage.ohg((defpackage.oju) this.a, aolnVar, 10, (boolean[]) null);
            case 11:
                return new defpackage.ohg((defpackage.oju) this.a, aolnVar, 11, (float[]) null);
            case 12:
                return new defpackage.ohg((uss) this.a, aolnVar, 12);
            case 13:
                return new defpackage.ohg((defpackage.tkl) this.a, aolnVar, 13);
            case 14:
                return new defpackage.ohg((defpackage.tkl) this.a, aolnVar, 14, (byte[]) null);
            case 15:
                return new defpackage.ohg((defpackage.okj) this.a, aolnVar, 15);
            case 16:
                return new defpackage.ohg((defpackage.okj) this.a, aolnVar, 16, (byte[]) null);
            case 17:
                return new defpackage.ohg((defpackage.oko) this.a, aolnVar, 17);
            case 18:
                return new defpackage.ohg((defpackage.oko) this.a, aolnVar, 18, (byte[]) null);
            case 19:
                return new defpackage.ohg((defpackage.oko) this.a, aolnVar, 19, (char[]) null);
            default:
                return new defpackage.ohg((defpackage.oko) this.a, aolnVar, 20, (short[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(ohi ohiVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ohiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.oju ojuVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ojuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.oju ojuVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ojuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.oju ojuVar, defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ojuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.oju ojuVar, defpackage.aoln aolnVar, int i, float[] fArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ojuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.oju ojuVar, defpackage.aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ojuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.oju ojuVar, defpackage.aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ojuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.oju ojuVar, defpackage.aoln aolnVar, int i, boolean[] zArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ojuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.okj okjVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = okjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.okj okjVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = okjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.oko okoVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = okoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.oko okoVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = okoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.oko okoVar, defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = okoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.oko okoVar, defpackage.aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = okoVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.tkl tklVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tklVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.tkl tklVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tklVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(defpackage.tkl tklVar, defpackage.aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tklVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(tpf tpfVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tpfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(tpf tpfVar, defpackage.aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = tpfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(uss ussVar, defpackage.aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.a = ussVar;
    }
}
