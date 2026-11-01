package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afob {
    public boolean a;
    public final java.lang.Object b;
    public java.lang.Object c;
    private final java.lang.Object d;
    private final java.lang.Object e;

    public afob(int i, int i2) {
        this.e = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i);
        this.d = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(i2);
        this.b = new bej(i, 90, 200);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(aoln aolnVar) {
        defpackage.afoa afoaVar;
        boolean z;
        if (aolnVar instanceof defpackage.afoa) {
            afoaVar = (defpackage.afoa) aolnVar;
            int i = afoaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                afoaVar.c = i - Integer.MIN_VALUE;
            } else {
                afoaVar = new defpackage.afoa(this, aolnVar);
            }
        } else {
            afoaVar = new defpackage.afoa(this, aolnVar);
        }
        java.lang.Object objE = afoaVar.a;
        aolu aoluVar = aolu.a;
        int i2 = afoaVar.c;
        java.lang.String str = null;
        if (i2 == 0) {
            aooc.af(objE);
            if (!this.a) {
                throw new java.lang.IllegalStateException("No more cluster pages.");
            }
            java.lang.Object objA = ((defpackage.agpj) this.e).a((android.accounts.Account) this.b);
            akzx akzxVarM = defpackage.akly.a.m();
            aooh.f(akzxVarM, "builder");
            java.lang.Object obj = this.d;
            akzxVarM.u();
            defpackage.akly aklyVar = (defpackage.akly) akzxVarM.b;
            j$.util.Objects.requireNonNull(obj);
            aklyVar.c = (aklt) obj;
            aklyVar.b |= 1;
            java.lang.Object obj2 = this.c;
            if (obj2 != null) {
                akzxVarM.u();
                defpackage.akly aklyVar2 = (defpackage.akly) akzxVarM.b;
                j$.util.Objects.requireNonNull(obj2);
                aklyVar2.b |= 2;
                aklyVar2.d = (java.lang.String) obj2;
            }
            alad aladVarP = akzxVarM.p();
            aooh.e(aladVarP, "build(...)");
            afoaVar.c = 1;
            objE = ((defpackage.zoe) objA).E(new defpackage.uke((defpackage.akly) aladVarP, (aoln) null, 17), afoaVar);
            if (objE == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objE);
        }
        defpackage.aklq aklqVar = ((defpackage.aklz) objE).b;
        if (aklqVar == null) {
            aklqVar = defpackage.aklq.a;
        }
        aooh.e(aklqVar, "getClusterPage(...)");
        if ((aklqVar.b & 1) != 0) {
            str = aklqVar.c;
            z = false;
        } else {
            z = true;
        }
        this.c = str;
        this.a = !z;
        return objE;
    }

    public final int b() {
        return ((cei) this.e).c();
    }

    public final int c() {
        return ((cei) this.d).c();
    }

    public final void d(int i) {
        ((cei) this.e).h(i);
    }

    public final void e(int i) {
        ((cei) this.d).h(i);
    }

    public final void f(int i, int i2) {
        if (i < 0.0f) {
            avo.c("Index should be non-negative");
        }
        d(i);
        ((bej) this.b).c(i);
        e(i2);
    }

    public afob(defpackage.agpj agpjVar, aklt akltVar, android.accounts.Account account) {
        this.e = agpjVar;
        this.d = akltVar;
        this.b = account;
        this.a = true;
    }
}
