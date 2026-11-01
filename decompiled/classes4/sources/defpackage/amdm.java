package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class amdm implements java.util.function.Predicate {
    private final /* synthetic */ int $cid;

    public /* synthetic */ amdm(int i) {
        this.$cid = i;
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
            case 6:
                break;
            case 7:
                break;
            case 8:
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
            case 6:
                break;
            case 7:
                break;
            case 8:
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
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            default:
                break;
        }
        return j$.util.function.Predicate.-CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(java.lang.Object obj) {
        switch (this.$cid) {
            case 0:
                return ((java.lang.String) obj).isEmpty();
            case 1:
                return ((j$.util.Optional) obj).isPresent();
            case 2:
                return ((j$.util.Optional) obj).isPresent();
            case 3:
                return ((java.lang.Boolean) obj).booleanValue();
            case 4:
                aimz aimzVar = defpackage.amev.a;
                return anty.aD((java.lang.String) obj);
            case 5:
                aimz aimzVar2 = defpackage.amev.a;
                return anty.aD((java.lang.String) obj);
            case 6:
                aimz aimzVar3 = defpackage.amev.a;
                if (!((aify) ((java.util.Map.Entry) obj).getValue()).isEmpty()) {
                    return true;
                }
                break;
            case 7:
                aimz aimzVar4 = defpackage.amev.a;
                return anty.aD((java.lang.String) obj);
            case 8:
                aihd aihdVar = defpackage.amev.d;
                defpackage.amfw amfwVarB = defpackage.amfw.b(((defpackage.amfx) obj).e);
                if (amfwVarB == null) {
                    amfwVarB = defpackage.amfw.UNKNOWN;
                }
                if (!aihdVar.contains(amfwVarB)) {
                    return true;
                }
                break;
            default:
                aimz aimzVar5 = defpackage.amev.a;
                if (!defpackage.amef.a.containsKey((java.lang.String) obj)) {
                    return true;
                }
                break;
        }
        return false;
    }
}
