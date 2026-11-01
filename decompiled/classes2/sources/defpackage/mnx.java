package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class mnx extends aomh implements aonn {
    private final /* synthetic */ int $cid;
    /* synthetic */ java.lang.Object a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnx(long j, aoln aolnVar, int i) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = j;
    }

    public final /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return c((defpackage.moc) obj, (aoln) obj2).b(aojh.a);
        }
        if (i == 1) {
            return c((apnt) obj, (aoln) obj2).b(aojh.a);
        }
        if (i != 2) {
            return c((efx) obj, (aoln) obj2).b(aojh.a);
        }
        return c((sqd) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        int i = this.$cid;
        if (i == 0) {
            aooc.af(obj);
            defpackage.vk vkVarX = mni.X(((defpackage.moc) this.a).p());
            akzx akzxVar = (akzx) vkVarX.a;
            akzxVar.u();
            defpackage.moc mocVar = (defpackage.moc) akzxVar.b;
            mocVar.b |= 1;
            mocVar.c = this.b;
            return vkVarX.F();
        }
        if (i == 1) {
            apnt apntVar = (apnt) this.a;
            aooc.af(obj);
            apntVar.w(this.b);
            return aojh.a;
        }
        if (i != 2) {
            aooc.af(obj);
            ((efx) this.a).e(dzk.s("last_accessed_suw_session_id"), new java.lang.Long(this.b));
            return aojh.a;
        }
        aooc.af(obj);
        ipc ipcVarZ = ttj.Z(((sqd) this.a).p());
        akzx akzxVar2 = (akzx) ipcVarZ.a;
        akzxVar2.u();
        sqd sqdVar = akzxVar2.b;
        sqdVar.b |= 1;
        sqdVar.c = this.b;
        return ipcVarZ.at();
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        int i = this.$cid;
        if (i == 0) {
            defpackage.mnx mnxVar = new defpackage.mnx(this.b, aolnVar, 0);
            mnxVar.a = obj;
            return mnxVar;
        }
        if (i == 1) {
            defpackage.mnx mnxVar2 = new defpackage.mnx(this.b, aolnVar, 1, (byte[]) null);
            mnxVar2.a = obj;
            return mnxVar2;
        }
        if (i != 2) {
            defpackage.mnx mnxVar3 = new defpackage.mnx(this.b, aolnVar, 3, (short[]) null);
            mnxVar3.a = obj;
            return mnxVar3;
        }
        defpackage.mnx mnxVar4 = new defpackage.mnx(this.b, aolnVar, 2, (char[]) null);
        mnxVar4.a = obj;
        return mnxVar4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnx(long j, aoln aolnVar, int i, byte[] bArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnx(long j, aoln aolnVar, int i, char[] cArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mnx(long j, aoln aolnVar, int i, short[] sArr) {
        super(2, aolnVar);
        this.$cid = i;
        this.b = j;
    }
}
