package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final /* synthetic */ class vpl implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vpl(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
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
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
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
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$negate(this);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
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
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v32, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v45, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v47, types: [aonj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v48, types: [aonj, java.lang.Object] */
    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                vpj vpjVar = (vpj) obj;
                java.lang.String str = vpjVar.d;
                android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) this.a;
                if (str.equals(phoneAccountHandle.getId()) && vpjVar.c.equals(phoneAccountHandle.getComponentName().flattenToString())) {
                    return true;
                }
                break;
            case 1:
                vph vphVar = (vph) obj;
                java.lang.String str2 = vphVar.g;
                java.lang.String str3 = (java.lang.String) this.a;
                if (str2.startsWith(str3)) {
                    java.lang.String strTrim = vphVar.g.substring(str3.length()).trim();
                    if (!strTrim.isEmpty() && j$.util.stream.IntStream.VivifiedWrapper.convert(fh$.ExternalSyntheticApiModelOutline0.m(strTrim)).allMatch(new abpl(1))) {
                        return true;
                    }
                }
                break;
            case 2:
                vpj vpjVar2 = (vpj) obj;
                java.lang.String str4 = vpjVar2.d;
                android.telecom.PhoneAccountHandle phoneAccountHandle2 = (android.telecom.PhoneAccountHandle) this.a;
                if (str4.equals(phoneAccountHandle2.getId()) && vpjVar2.c.equals(phoneAccountHandle2.getComponentName().flattenToString())) {
                    return true;
                }
                break;
            case 3:
                return ((vph) obj).c.equals(this.a);
            case 4:
                vph vphVar2 = (vph) obj;
                if (((vps) this.a).a.contains(vphVar2.c)) {
                    java.lang.String str5 = vphVar2.d;
                    if (!str5.isEmpty() && j$.nio.file.Files.exists(j$.nio.file.Paths.get(str5, new java.lang.String[0]), new j$.nio.file.LinkOption[0])) {
                        return true;
                    }
                }
                break;
            case 5:
                return defpackage.vth.b((vtf) obj, (android.telecom.PhoneAccountHandle) this.a);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                vtt vttVar = ((vtu) obj).c;
                if (vttVar == null) {
                    vttVar = vtt.a;
                }
                return vttVar.equals(this.a);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                ?? r5 = this.a;
                vuy vuyVar = (vuy) obj;
                java.lang.String[] strArr = defpackage.vva.a;
                for (vtt vttVar2 : r5) {
                    if ((vttVar2.b & 2) != 0) {
                        vtq vtqVar = vttVar2.d;
                        if (vtqVar == null) {
                            vtqVar = vtq.a;
                        }
                        if (android.text.TextUtils.equals(vtqVar.c, vuyVar.b) && android.text.TextUtils.equals(vtqVar.d, vuyVar.c)) {
                            return true;
                        }
                    } else if (!vttVar2.c.isEmpty() && android.text.TextUtils.equals(vttVar2.c, vuyVar.a)) {
                        return true;
                    }
                }
                break;
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                return ((java.lang.Boolean) this.a.a(obj)).booleanValue();
            case 9:
                vtt vttVar3 = ((vtu) obj).c;
                if (vttVar3 == null) {
                    vttVar3 = vtt.a;
                }
                return vttVar3.equals(this.a);
            case 10:
                java.util.Set set = ((vxq) this.a).K;
                defpackage.kiu kiuVar = ((uzo) obj).d;
                if (kiuVar == null) {
                    kiuVar = defpackage.kiu.a;
                }
                if (!set.contains(java.lang.Long.valueOf(kiuVar.d))) {
                    return true;
                }
                break;
            case 11:
                if (!defpackage.vze.i((defpackage.vzi) obj, (android.telecom.PhoneAccountHandle) this.a)) {
                    return true;
                }
                break;
            case 12:
                return wle.b((amft) obj, (amft) this.a);
            case 13:
                return wle.b((amft) obj, (amft) this.a);
            case 14:
                return ((java.lang.Boolean) this.a.a(obj)).booleanValue();
            case 15:
                defpackage.aimz aimzVar = wxm.a;
                alex alexVarB = alex.b(((amnz) obj).c);
                if (alexVarB == null) {
                    alexVarB = alex.a;
                }
                if (alexVarB == this.a) {
                    return true;
                }
                break;
            case 16:
                return ((java.lang.Boolean) this.a.a(obj)).booleanValue();
            case 17:
                return ((java.lang.Boolean) this.a.a(obj)).booleanValue();
            case 18:
                if (((zpo) obj) == this.a) {
                    return true;
                }
                break;
            case 19:
                if (((zpo) obj) != this.a) {
                    return true;
                }
                break;
            default:
                return ((ztu) ((afpl) obj).a).d.equals(this.a);
        }
        return false;
    }
}
