package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aiuq implements defpackage.aonj {
    private final defpackage.aonj a;
    private final long b;
    private volatile java.lang.Object c;
    private volatile long d;
    private final defpackage.apdp e = new defpackage.apdp();

    public aiuq(defpackage.aonj aonjVar, long j) {
        this.a = aonjVar;
        this.b = j;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.aonj
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final java.lang.Object a(defpackage.aoln aolnVar) throws java.lang.Throwable {
        aiup aiupVar;
        defpackage.aoos aoosVar;
        long jNanoTime;
        defpackage.apdp apdpVar;
        defpackage.apdp apdpVar2;
        defpackage.aoos aoosVar2;
        long j;
        long j2;
        if (aolnVar instanceof aiup) {
            aiupVar = (aiup) aolnVar;
            int i = aiupVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aiupVar.d = i - Integer.MIN_VALUE;
            } else {
                aiupVar = new aiup(this, aolnVar);
            }
        } else {
            aiupVar = new aiup(this, aolnVar);
        }
        java.lang.Object obj = aiupVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = aiupVar.d;
        try {
            if (i2 == 0) {
                defpackage.aooc.af(obj);
                aoosVar = new defpackage.aoos();
                aoosVar.a = this.d;
                jNanoTime = java.lang.System.nanoTime();
                long j3 = aoosVar.a;
                if (j3 == 0 || jNanoTime - j3 >= 0) {
                    apdpVar = this.e;
                    aiupVar.e = aoosVar;
                    aiupVar.f = apdpVar;
                    aiupVar.a = jNanoTime;
                    aiupVar.d = 1;
                    if (apdpVar.b(aiupVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return this.c;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = aiupVar.a;
                apdpVar2 = aiupVar.f;
                aoosVar2 = aiupVar.e;
                try {
                    defpackage.aooc.af(obj);
                    this.c = obj;
                    j2 = j + this.b;
                    aoosVar2.a = j2;
                    if (j2 == 0) {
                        j2 = 1;
                    }
                    this.d = j2;
                    apdpVar2.d();
                    return obj;
                } catch (java.lang.Throwable th) {
                    th = th;
                    apdpVar2.d();
                    throw th;
                }
            }
            jNanoTime = aiupVar.a;
            apdpVar = aiupVar.f;
            defpackage.aoos aoosVar3 = aiupVar.e;
            defpackage.aooc.af(obj);
            aoosVar = aoosVar3;
            if (aoosVar.a != this.d) {
                apdpVar.d();
                return this.c;
            }
            defpackage.aonj aonjVar = this.a;
            aiupVar.e = aoosVar;
            aiupVar.f = apdpVar;
            aiupVar.a = jNanoTime;
            aiupVar.d = 2;
            java.lang.Object objA = aonjVar.a(aiupVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            aoosVar2 = aoosVar;
            obj = objA;
            apdpVar2 = apdpVar;
            j = jNanoTime;
            this.c = obj;
            j2 = j + this.b;
            aoosVar2.a = j2;
            if (j2 == 0) {
                j2 = 1;
            }
            this.d = j2;
            apdpVar2.d();
            return obj;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apdpVar2 = apdpVar;
            apdpVar2.d();
            throw th;
        }
    }
}
