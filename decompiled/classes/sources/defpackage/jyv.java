package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class jyv implements java.util.function.Consumer {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ jyv(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                java.lang.Object obj2 = this.a;
                ((defpackage.jyy) obj2).d.q((defpackage.aeun) obj, defpackage.ruc.D, defpackage.rub.b);
                break;
            case 1:
                java.lang.Object obj3 = this.a;
                ((defpackage.jyy) obj3).d.q((defpackage.aeun) obj, defpackage.ruc.E, defpackage.rub.b);
                break;
            case 2:
                java.lang.String str = (java.lang.String) obj;
                defpackage.akzx akzxVar = (defpackage.akzx) this.a;
                akzxVar.u();
                defpackage.ampq ampqVar = (defpackage.ampq) akzxVar.b;
                defpackage.ampq ampqVar2 = defpackage.ampq.a;
                j$.util.Objects.requireNonNull(str);
                ampqVar.b |= 16;
                ampqVar.g = str;
                break;
            case 3:
                java.lang.String str2 = (java.lang.String) obj;
                defpackage.akzx akzxVar2 = (defpackage.akzx) this.a;
                akzxVar2.u();
                defpackage.ampq ampqVar3 = (defpackage.ampq) akzxVar2.b;
                defpackage.ampq ampqVar4 = defpackage.ampq.a;
                j$.util.Objects.requireNonNull(str2);
                ampqVar3.b |= 128;
                ampqVar3.j = str2;
                break;
            case 4:
                java.lang.String str3 = (java.lang.String) obj;
                defpackage.akzx akzxVar3 = (defpackage.akzx) this.a;
                akzxVar3.u();
                defpackage.ampq ampqVar5 = (defpackage.ampq) akzxVar3.b;
                defpackage.ampq ampqVar6 = defpackage.ampq.a;
                j$.util.Objects.requireNonNull(str3);
                ampqVar5.b |= 1024;
                ampqVar5.m = str3;
                break;
            case 5:
                java.lang.String str4 = (java.lang.String) obj;
                defpackage.akzx akzxVar4 = (defpackage.akzx) this.a;
                akzxVar4.u();
                defpackage.ampq ampqVar7 = (defpackage.ampq) akzxVar4.b;
                defpackage.ampq ampqVar8 = defpackage.ampq.a;
                j$.util.Objects.requireNonNull(str4);
                ampqVar7.b |= 2048;
                ampqVar7.n = str4;
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                java.lang.String str5 = (java.lang.String) obj;
                defpackage.akzx akzxVar5 = (defpackage.akzx) this.a;
                akzxVar5.u();
                defpackage.ampq ampqVar9 = (defpackage.ampq) akzxVar5.b;
                defpackage.ampq ampqVar10 = defpackage.ampq.a;
                j$.util.Objects.requireNonNull(str5);
                ampqVar9.b |= 32;
                ampqVar9.h = str5;
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.String str6 = (java.lang.String) obj;
                defpackage.akzx akzxVar6 = (defpackage.akzx) this.a;
                akzxVar6.u();
                defpackage.ampq ampqVar11 = (defpackage.ampq) akzxVar6.b;
                defpackage.ampq ampqVar12 = defpackage.ampq.a;
                j$.util.Objects.requireNonNull(str6);
                ampqVar11.b |= 256;
                ampqVar11.k = str6;
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                boolean zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
                defpackage.akzx akzxVar7 = (defpackage.akzx) this.a;
                akzxVar7.u();
                defpackage.ampq ampqVar13 = (defpackage.ampq) akzxVar7.b;
                defpackage.ampq ampqVar14 = defpackage.ampq.a;
                ampqVar13.b |= 65536;
                ampqVar13.s = zBooleanValue;
                break;
            case 9:
                java.lang.String str7 = (java.lang.String) obj;
                defpackage.akzx akzxVar8 = (defpackage.akzx) this.a;
                akzxVar8.u();
                defpackage.ampq ampqVar15 = (defpackage.ampq) akzxVar8.b;
                defpackage.ampq ampqVar16 = defpackage.ampq.a;
                j$.util.Objects.requireNonNull(str7);
                ampqVar15.b |= 16384;
                ampqVar15.q = str7;
                break;
            case 10:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                defpackage.akzx akzxVar9 = (defpackage.akzx) this.a;
                akzxVar9.u();
                defpackage.ampu ampuVar = (defpackage.ampu) akzxVar9.b;
                defpackage.ampu ampuVar2 = defpackage.ampu.a;
                ampuVar.b |= 1;
                ampuVar.c = iIntValue;
                break;
            case 11:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                defpackage.akzx akzxVar10 = (defpackage.akzx) this.a;
                akzxVar10.u();
                defpackage.ampu ampuVar3 = (defpackage.ampu) akzxVar10.b;
                defpackage.ampu ampuVar4 = defpackage.ampu.a;
                ampuVar3.b |= 4;
                ampuVar3.e = iIntValue2;
                break;
            case 12:
                defpackage.amtg amtgVar = (defpackage.amtg) obj;
                defpackage.akzx akzxVar11 = (defpackage.akzx) this.a;
                akzxVar11.u();
                defpackage.ampv ampvVar = (defpackage.ampv) akzxVar11.b;
                defpackage.ampv ampvVar2 = defpackage.ampv.a;
                j$.util.Objects.requireNonNull(amtgVar);
                ampvVar.r = amtgVar;
                ampvVar.b |= Integer.MIN_VALUE;
                break;
            case 13:
                int iIntValue3 = ((java.lang.Integer) obj).intValue();
                defpackage.akzx akzxVar12 = (defpackage.akzx) this.a;
                akzxVar12.u();
                defpackage.ampu ampuVar5 = (defpackage.ampu) akzxVar12.b;
                defpackage.ampu ampuVar6 = defpackage.ampu.a;
                ampuVar5.b |= 2;
                ampuVar5.d = iIntValue3;
                break;
            case 14:
                java.lang.Object obj4 = this.a;
                ((defpackage.tcv) obj4).f.p((defpackage.aeun) obj, defpackage.ruc.bu);
                break;
            case 15:
                ((android.app.Activity) this.a).setTheme(((java.lang.Integer) obj).intValue());
                break;
            case 16:
                ((android.content.Context) this.a).setTheme(((java.lang.Integer) obj).intValue());
                break;
            default:
                defpackage.aimz aimzVar = defpackage.vzh.a;
                ((defpackage.rsr) this.a).aC((defpackage.rsr) obj);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.$cid) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            default:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
