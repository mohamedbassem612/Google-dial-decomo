package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class jaf implements defpackage.aomy {
    private final /* synthetic */ int $cid;

    public /* synthetic */ jaf(int i) {
        this.$cid = i;
    }

    @Override // defpackage.aomy
    public final java.lang.Object a() {
        switch (this.$cid) {
            case 0:
                return new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.TRUE, defpackage.cdu.c);
            case 1:
                return defpackage.afsq.ce();
            case 2:
                return defpackage.aojh.a;
            case 3:
                return new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
            case 4:
                return new androidx.compose.runtime.ParcelableSnapshotMutableFloatState(0.0f);
            case 5:
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.aojh.a;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                android.net.Uri uri = kst.a;
                uzx uzxVarZ = ajee.z(ajds.a.m());
                defpackage.akzx akzxVar = (defpackage.akzx) uzxVarZ.a;
                akzxVar.u();
                akzxVar.b.c = defpackage.a.Q(4);
                akzxVar.u();
                akzxVar.b.d = 5;
                ajds ajdsVarAg = uzxVarZ.ag();
                uzx uzxVarZ2 = ajee.z(ajdsVarAg.L());
                defpackage.akzx akzxVarM = ajdr.a.m();
                defpackage.aooh.f(akzxVarM, "builder");
                akzxVarM.u();
                akzxVarM.b.b = defpackage.a.T(3);
                java.lang.String str = android.os.Build.DEVICE;
                defpackage.aooh.e(str, "DEVICE");
                defpackage.aooh.f(str, "value");
                akzxVarM.u();
                ajdr ajdrVar = akzxVarM.b;
                j$.util.Objects.requireNonNull(str);
                ajdrVar.c = str;
                java.lang.String strValueOf = java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT);
                defpackage.aooh.f(strValueOf, "value");
                akzxVarM.u();
                ajdr ajdrVar2 = akzxVarM.b;
                j$.util.Objects.requireNonNull(strValueOf);
                ajdrVar2.d = strValueOf;
                ajdr ajdrVarR = akzxVarM.r();
                defpackage.aooh.e(ajdrVarR, "build(...)");
                ajdr ajdrVar3 = ajdrVarR;
                defpackage.aooh.f(ajdrVar3, "value");
                defpackage.akzx akzxVar2 = (defpackage.akzx) uzxVarZ2.a;
                akzxVar2.u();
                ajds ajdsVar = akzxVar2.b;
                j$.util.Objects.requireNonNull(ajdrVar3);
                ajdsVar.e = ajdrVar3;
                ajdsVar.b |= 1;
                ajds ajdsVarAg2 = uzxVarZ2.ag();
                defpackage.aish aishVar = defpackage.aish.f;
                return "gctx-c=" + aishVar.k(ajdsVarAg.i()) + ";gctx-s=" + aishVar.k(ajdsVarAg2.i());
            case 9:
                return defpackage.aojh.a;
            case 10:
                return defpackage.afsq.ce();
            case 11:
                return defpackage.aojh.a;
            case 12:
            case 14:
                return 0L;
            case 13:
                return defpackage.aojh.a;
            case 15:
                return new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
            case 16:
                return defpackage.afsq.ce();
            case 17:
                return new ahtm(new zsy());
            case 18:
                return new ahtm(new zsy());
            case 19:
                return defpackage.aojh.a;
            default:
                return defpackage.afsq.ce();
        }
    }
}
