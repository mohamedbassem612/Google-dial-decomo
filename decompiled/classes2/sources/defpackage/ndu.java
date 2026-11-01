package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ndu extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    int a;
    final /* synthetic */ java.lang.Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nej nejVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nejVar;
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
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 8:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 9:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 10:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 11:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 12:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case 16:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
            default:
                return c((aoss) obj, (aoln) obj2).b(aojh.a);
        }
    }

    public final java.lang.Object b(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                aolu aoluVar = aolu.a;
                int i = this.a;
                aooc.af(obj);
                if (i == 0) {
                    java.lang.Object obj2 = this.b;
                    this.a = 1;
                    if (((defpackage.nej) obj2).s(this) == aoluVar) {
                        return aoluVar;
                    }
                }
                return aojh.a;
            case 1:
                aolu aoluVar2 = aolu.a;
                int i2 = this.a;
                aooc.af(obj);
                if (i2 == 0) {
                    java.lang.Object obj3 = this.b;
                    defpackage.nmo nmoVar = defpackage.nmo.RINGING_DURING_ACTIVE_SESSION;
                    this.a = 1;
                    if (((defpackage.nej) obj3).O(nmoVar, this) == aoluVar2) {
                        return aoluVar2;
                    }
                }
                return aojh.a;
            case 2:
                aolu aoluVar3 = aolu.a;
                int i3 = this.a;
                aooc.af(obj);
                if (i3 == 0) {
                    java.lang.Object obj4 = this.b;
                    this.a = 1;
                    if (((defpackage.nej) obj4).s(this) == aoluVar3) {
                        return aoluVar3;
                    }
                }
                return aojh.a;
            case 3:
                aolu aoluVar4 = aolu.a;
                try {
                    if (this.a != 0) {
                        aooc.af(obj);
                    } else {
                        aooc.af(obj);
                        defpackage.njd njdVar = ((defpackage.nej) this.b).y;
                        this.a = 1;
                        if (njdVar.n(this) == aoluVar4) {
                            return aoluVar4;
                        }
                    }
                    break;
                } catch (java.lang.Exception e) {
                    defpackage.nej.a.c().k(e).m(aioa.b).l("com/android/dialer/dobby/impl/service/DobbyLifecycleController", "stopPlayingWithoutAwaiting$<anonymous>", 2138, "DobbyLifecycleController.kt").v("stopPlayingWithoutAwaiting failed");
                }
                return aojh.a;
            case 4:
                aolu aoluVar5 = aolu.a;
                int i4 = this.a;
                aooc.af(obj);
                if (i4 == 0) {
                    defpackage.nqh nqhVar = ((defpackage.nex) this.b).c;
                    this.a = 1;
                    if (nqhVar.f(this) == aoluVar5) {
                        return aoluVar5;
                    }
                }
                return aojh.a;
            case 5:
                aolu aoluVar6 = aolu.a;
                int i5 = this.a;
                aooc.af(obj);
                if (i5 == 0) {
                    defpackage.nqh nqhVar2 = ((defpackage.nfa) this.b).d;
                    this.a = 1;
                    if (nqhVar2.f(this) == aoluVar6) {
                        return aoluVar6;
                    }
                }
                return aojh.a;
            case 6:
                aolu aoluVar7 = aolu.a;
                int i6 = this.a;
                aooc.af(obj);
                if (i6 == 0) {
                    java.lang.Object obj5 = this.b;
                    this.a = 1;
                    obj = ((defpackage.ogj) obj5).a(this);
                    if (obj == aoluVar7) {
                        return aoluVar7;
                    }
                }
                defpackage.nmu nmuVar = (defpackage.nmu) obj;
                if ((nmuVar.b & 32) != 0) {
                    defpackage.nmt nmtVar = nmuVar.k;
                    if (nmtVar == null) {
                        nmtVar = defpackage.nmt.a;
                    }
                    alwf alwfVar = nmtVar.c;
                    if (alwfVar == null) {
                        alwfVar = alwf.a;
                    }
                    java.lang.String str = alwfVar.c;
                    aooh.e(str, "getText(...)");
                    if (str.length() != 0) {
                        defpackage.nmt nmtVar2 = nmuVar.k;
                        if (nmtVar2 == null) {
                            nmtVar2 = defpackage.nmt.a;
                        }
                        j$.util.Optional optionalOf = j$.util.Optional.of(new defpackage.nmy(str, nmtVar2.d));
                        aooh.e(optionalOf, "of(...)");
                        return optionalOf;
                    }
                }
                j$.util.Optional optionalEmpty = j$.util.Optional.empty();
                aooh.e(optionalEmpty, "empty(...)");
                return optionalEmpty;
            case 7:
                aolu aoluVar8 = aolu.a;
                int i7 = this.a;
                aooc.af(obj);
                if (i7 == 0) {
                    java.lang.Object obj6 = this.b;
                    this.a = 1;
                    obj = ((defpackage.ogj) obj6).a(this);
                    if (obj == aoluVar8) {
                        return aoluVar8;
                    }
                }
                alwy alwyVar = ((defpackage.nmu) obj).d;
                if (alwyVar == null) {
                    alwyVar = alwy.a;
                }
                alwy alwyVar2 = alwyVar;
                aooh.e(alwyVar2, "getConversationState(...)");
                return alwyVar2;
            case 8:
                aolu aoluVar9 = aolu.a;
                int i8 = this.a;
                aooc.af(obj);
                if (i8 == 0) {
                    java.lang.Object obj7 = this.b;
                    this.a = 1;
                    obj = ((defpackage.ogj) obj7).a(this);
                    if (obj == aoluVar9) {
                        return aoluVar9;
                    }
                }
                defpackage.nmo nmoVarB = defpackage.nmo.b(((defpackage.nmu) obj).c);
                return nmoVarB == null ? defpackage.nmo.UNRECOGNIZED : nmoVarB;
            case 9:
                aolu aoluVar10 = aolu.a;
                int i9 = this.a;
                aooc.af(obj);
                if (i9 == 0) {
                    java.lang.Object obj8 = this.b;
                    this.a = 1;
                    obj = ((defpackage.ogj) obj8).a(this);
                    if (obj == aoluVar10) {
                        return aoluVar10;
                    }
                }
                defpackage.nms nmsVarB = defpackage.nms.b(((defpackage.nmu) obj).s);
                return nmsVarB == null ? defpackage.nms.UNRECOGNIZED : nmsVarB;
            case 10:
                aolu aoluVar11 = aolu.a;
                int i10 = this.a;
                aooc.af(obj);
                if (i10 == 0) {
                    java.lang.Object obj9 = this.b;
                    this.a = 1;
                    obj = ((defpackage.ogj) obj9).a(this);
                    if (obj == aoluVar11) {
                        return aoluVar11;
                    }
                }
                return java.lang.Boolean.valueOf(((defpackage.nmu) obj).o);
            case 11:
                aolu aoluVar12 = aolu.a;
                int i11 = this.a;
                aooc.af(obj);
                if (i11 == 0) {
                    java.lang.Object obj10 = this.b;
                    this.a = 1;
                    obj = ((defpackage.ogj) obj10).a(this);
                    if (obj == aoluVar12) {
                        return aoluVar12;
                    }
                }
                return java.lang.Boolean.valueOf(((defpackage.nmu) obj).p);
            case 12:
                aolu aoluVar13 = aolu.a;
                int i12 = this.a;
                aooc.af(obj);
                if (i12 == 0) {
                    java.lang.Object obj11 = this.b;
                    this.a = 1;
                    obj = ((defpackage.ogj) obj11).a(this);
                    if (obj == aoluVar13) {
                        return aoluVar13;
                    }
                }
                return java.lang.Boolean.valueOf(((defpackage.nmu) obj).z);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                aolu aoluVar14 = aolu.a;
                int i13 = this.a;
                aooc.af(obj);
                if (i13 == 0) {
                    java.lang.Object obj12 = this.b;
                    this.a = 1;
                    obj = ((defpackage.ogj) obj12).a(this);
                    if (obj == aoluVar14) {
                        return aoluVar14;
                    }
                }
                return java.lang.Boolean.valueOf(((defpackage.nmu) obj).y);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                aolu aoluVar15 = aolu.a;
                int i14 = this.a;
                aooc.af(obj);
                if (i14 != 0) {
                    if (i14 == 1) {
                    }
                    return aojh.a;
                }
                java.lang.Object obj13 = this.b;
                this.a = 1;
                obj = ((defpackage.nhq) obj13).A.d(this);
                if (obj == aoluVar15) {
                    return aoluVar15;
                }
                defpackage.njm njmVar = (defpackage.njm) obj;
                if (njmVar != null) {
                    this.a = 2;
                    if (njmVar.c(this) == aoluVar15) {
                        return aoluVar15;
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aolu aoluVar16 = aolu.a;
                int i15 = this.a;
                aooc.af(obj);
                if (i15 != 0) {
                    if (i15 == 1) {
                    }
                    return aojh.a;
                }
                java.lang.Object obj14 = this.b;
                this.a = 1;
                obj = ((defpackage.nhq) obj14).A.d(this);
                if (obj == aoluVar16) {
                    return aoluVar16;
                }
                defpackage.njm njmVar2 = (defpackage.njm) obj;
                if (njmVar2 != null) {
                    this.a = 2;
                    if (njmVar2.f(this) == aoluVar16) {
                        return aoluVar16;
                    }
                }
                return aojh.a;
            case 16:
                aolu aoluVar17 = aolu.a;
                int i16 = this.a;
                aooc.af(obj);
                if (i16 == 0) {
                    java.lang.Object obj15 = this.b;
                    this.a = 1;
                    if (((defpackage.nhq) obj15).p(this) == aoluVar17) {
                        return aoluVar17;
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                aolu aoluVar18 = aolu.a;
                int i17 = this.a;
                aooc.af(obj);
                if (i17 == 0) {
                    defpackage.nqh nqhVar3 = ((defpackage.nhq) this.b).j;
                    this.a = 1;
                    if (nqhVar3.b(this) == aoluVar18) {
                        return aoluVar18;
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                aolu aoluVar19 = aolu.a;
                int i18 = this.a;
                aooc.af(obj);
                if (i18 == 0) {
                    java.lang.Object obj16 = this.b;
                    this.a = 1;
                    if (((defpackage.nhq) obj16).l(this) == aoluVar19) {
                        return aoluVar19;
                    }
                }
                return aojh.a;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                aolu aoluVar20 = aolu.a;
                int i19 = this.a;
                aooc.af(obj);
                if (i19 == 0) {
                    java.lang.Object obj17 = this.b;
                    this.a = 1;
                    if (((defpackage.nhq) obj17).d(this) == aoluVar20) {
                        return aoluVar20;
                    }
                }
                return aojh.a;
            default:
                aolu aoluVar21 = aolu.a;
                int i20 = this.a;
                aooc.af(obj);
                if (i20 == 0) {
                    defpackage.nrv nrvVar = ((defpackage.nhq) this.b).i;
                    this.a = 1;
                    java.lang.Object objA = nrvVar.b.a(this);
                    if (objA != aoluVar21) {
                        objA = aojh.a;
                    }
                    if (objA == aoluVar21) {
                        return aoluVar21;
                    }
                }
                return aojh.a;
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        switch (this.$cid) {
            case 0:
                return new defpackage.ndu((defpackage.nej) this.b, aolnVar, 0);
            case 1:
                return new defpackage.ndu((defpackage.nej) this.b, aolnVar, 1, (byte[]) null);
            case 2:
                return new defpackage.ndu((defpackage.nej) this.b, aolnVar, 2, (char[]) null);
            case 3:
                return new defpackage.ndu((defpackage.nej) this.b, aolnVar, 3, (short[]) null);
            case 4:
                return new defpackage.ndu((defpackage.nex) this.b, aolnVar, 4);
            case 5:
                return new defpackage.ndu((defpackage.nfa) this.b, aolnVar, 5);
            case 6:
                return new defpackage.ndu((defpackage.ogj) this.b, aolnVar, 6);
            case 7:
                return new defpackage.ndu((defpackage.ogj) this.b, aolnVar, 7, (byte[]) null);
            case 8:
                return new defpackage.ndu((defpackage.ogj) this.b, aolnVar, 8, (char[]) null);
            case 9:
                return new defpackage.ndu((defpackage.ogj) this.b, aolnVar, 9, (short[]) null);
            case 10:
                return new defpackage.ndu((defpackage.ogj) this.b, aolnVar, 10, (int[]) null);
            case 11:
                return new defpackage.ndu((defpackage.ogj) this.b, aolnVar, 11, (boolean[]) null);
            case 12:
                return new defpackage.ndu((defpackage.ogj) this.b, aolnVar, 12, (float[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                return new defpackage.ndu((defpackage.ogj) this.b, aolnVar, 13, (byte[][]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                return new defpackage.ndu((defpackage.nhq) this.b, aolnVar, 14);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                return new defpackage.ndu((defpackage.nhq) this.b, aolnVar, 15, (byte[]) null);
            case 16:
                return new defpackage.ndu((defpackage.nhq) this.b, aolnVar, 16, (char[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new defpackage.ndu((defpackage.nhq) this.b, aolnVar, 17, (short[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new defpackage.ndu((defpackage.nhq) this.b, aolnVar, 18, (int[]) null);
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new defpackage.ndu((defpackage.nhq) this.b, aolnVar, 19, (boolean[]) null);
            default:
                return new defpackage.ndu((defpackage.nhq) this.b, aolnVar, 20, (float[]) null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nej nejVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nejVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nej nejVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nejVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nej nejVar, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nejVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nex nexVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nexVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nfa nfaVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nfaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nhq nhqVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nhqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nhq nhqVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nhqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nhq nhqVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nhqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nhq nhqVar, aoln aolnVar, int i, float[] fArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nhqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nhq nhqVar, aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nhqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nhq nhqVar, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nhqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.nhq nhqVar, aoln aolnVar, int i, boolean[] zArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = nhqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.ogj ogjVar, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ogjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.ogj ogjVar, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ogjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.ogj ogjVar, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ogjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.ogj ogjVar, aoln aolnVar, int i, float[] fArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ogjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.ogj ogjVar, aoln aolnVar, int i, int[] iArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ogjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.ogj ogjVar, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ogjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.ogj ogjVar, aoln aolnVar, int i, boolean[] zArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ogjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndu(defpackage.ogj ogjVar, aoln aolnVar, int i, byte[][] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = ogjVar;
    }
}
