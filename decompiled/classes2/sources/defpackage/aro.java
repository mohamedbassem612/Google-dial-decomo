package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aro extends aomh implements aono {
    private final /* synthetic */ int $cid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aro(aoln aolnVar, int i) {
        super(3, aolnVar);
        this.$cid = i;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int i = this.$cid;
        if (i == 0) {
            ((java.lang.Number) obj2).floatValue();
            new defpackage.aro((aoln) obj3, 0);
            aojh aojhVar = aojh.a;
            aooc.af(aojhVar);
            return aojhVar;
        }
        if (i == 1) {
            long j = ((cpm) obj2).a;
            new defpackage.aro((aoln) obj3, 1, (byte[]) null);
            aojh aojhVar2 = aojh.a;
            aooc.af(aojhVar2);
            return aojhVar2;
        }
        if (i == 2) {
            long j2 = ((cpm) obj2).a;
            new defpackage.aro((aoln) obj3, 2, (char[]) null);
            aojh aojhVar3 = aojh.a;
            aooc.af(aojhVar3);
            return aojhVar3;
        }
        if (i == 3) {
            ((java.lang.Number) obj).intValue();
            return new defpackage.aro((aoln) obj3, 3, (short[]) null).b(aojh.a);
        }
        if (i != 4) {
            new defpackage.aro((aoln) obj3, 5, (boolean[]) null);
            return anar.o(aojh.a);
        }
        new defpackage.aro((aoln) obj3, 4, (int[]) null);
        return anar.o(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aooc.af(obj);
            return aojh.a;
        }
        if (i == 1) {
            aooc.af(obj);
            return aojh.a;
        }
        if (i == 2) {
            aooc.af(obj);
            return aojh.a;
        }
        if (i != 3) {
            return i != 4 ? anar.o(obj) : anar.o(obj);
        }
        aooc.af(obj);
        return java.lang.Boolean.FALSE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aro(aoln aolnVar, int i, byte[] bArr) {
        super(3, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aro(aoln aolnVar, int i, char[] cArr) {
        super(3, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aro(aoln aolnVar, int i, int[] iArr) {
        super(3, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aro(aoln aolnVar, int i, short[] sArr) {
        super(3, aolnVar);
        this.$cid = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aro(aoln aolnVar, int i, boolean[] zArr) {
        super(3, aolnVar);
        this.$cid = i;
    }
}
