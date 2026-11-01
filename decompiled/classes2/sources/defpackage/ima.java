package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ima implements defpackage.ihn {
    private java.lang.Long a;
    private final apdp b = new apdp();

    @Override // defpackage.ihn
    public final java.lang.Object a(defpackage.igd igdVar, tvx tvxVar, aoln aolnVar) {
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ihn
    public final java.lang.Object b(defpackage.igd igdVar, twj twjVar, aoln aolnVar) {
        defpackage.ilw ilwVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ilw) {
            ilwVar = (defpackage.ilw) aolnVar;
            int i = ilwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilwVar.c = i - Integer.MIN_VALUE;
            } else {
                ilwVar = new defpackage.ilw(this, aolnVar);
            }
        } else {
            ilwVar = new defpackage.ilw(this, aolnVar);
        }
        java.lang.Object obj = ilwVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ilwVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdpVar = this.b;
            ilwVar.d = twjVar;
            ilwVar.e = apdpVar;
            ilwVar.c = 1;
            if (apdpVar.b(ilwVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = ilwVar.e;
            twj twjVar2 = ilwVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            twjVar = twjVar2;
        }
        try {
            if (this.a != null) {
                amld amldVar = (twjVar.b == 2 ? (amle) twjVar.c : amle.a).c;
                if (amldVar == null) {
                    amldVar = amld.a;
                }
                amlg amlgVar = (amldVar.b == 2 ? (amla) amldVar.c : amla.a).d;
                if (amlgVar == null) {
                    amlgVar = amlg.a;
                }
                this.a = new java.lang.Long(amlgVar.d);
            }
            return aojh.a;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ihn
    public final java.lang.Object c(defpackage.igd igdVar, twj twjVar, aoln aolnVar) {
        defpackage.ilx ilxVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ilx) {
            ilxVar = (defpackage.ilx) aolnVar;
            int i = ilxVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilxVar.c = i - Integer.MIN_VALUE;
            } else {
                ilxVar = new defpackage.ilx(this, aolnVar);
            }
        } else {
            ilxVar = new defpackage.ilx(this, aolnVar);
        }
        java.lang.Object obj = ilxVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ilxVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdpVar = this.b;
            ilxVar.d = twjVar;
            ilxVar.e = apdpVar;
            ilxVar.c = 1;
            if (apdpVar.b(ilxVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = ilxVar.e;
            twj twjVar2 = ilxVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            twjVar = twjVar2;
        }
        try {
            if (this.a != null) {
                amld amldVar = (twjVar.b == 2 ? (amle) twjVar.c : amle.a).c;
                if (amldVar == null) {
                    amldVar = amld.a;
                }
                amlg amlgVar = (amldVar.b == 1 ? (amkw) amldVar.c : amkw.a).e;
                if (amlgVar == null) {
                    amlgVar = amlg.a;
                }
                this.a = new java.lang.Long(amlgVar.d);
            }
            return aojh.a;
        } finally {
            apdpVar.d();
        }
    }

    @Override // defpackage.ihn
    public final java.lang.Object d(twg twgVar, aoln aolnVar) {
        return aojh.a;
    }

    @Override // defpackage.ihn
    public final /* synthetic */ java.lang.Object e() {
        return aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object g(aoln aolnVar) {
        defpackage.ilu iluVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ilu) {
            iluVar = (defpackage.ilu) aolnVar;
            int i = iluVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iluVar.c = i - Integer.MIN_VALUE;
            } else {
                iluVar = new defpackage.ilu(this, aolnVar);
            }
        } else {
            iluVar = new defpackage.ilu(this, aolnVar);
        }
        java.lang.Object obj = iluVar.a;
        java.lang.Long l = aolu.a;
        int i2 = iluVar.c;
        try {
            if (i2 == 0) {
                aooc.af(obj);
                apdp apdpVar2 = this.b;
                iluVar.d = apdpVar2;
                iluVar.c = 1;
                if (apdpVar2.b(iluVar) != l) {
                    apdpVar = apdpVar2;
                }
                return l;
            }
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = iluVar.d;
            aooc.af(obj);
            l = this.a;
            return l;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(aoln aolnVar) {
        defpackage.ily ilyVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ily) {
            ilyVar = (defpackage.ily) aolnVar;
            int i = ilyVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilyVar.c = i - Integer.MIN_VALUE;
            } else {
                ilyVar = new defpackage.ily(this, aolnVar);
            }
        } else {
            ilyVar = new defpackage.ily(this, aolnVar);
        }
        java.lang.Object obj = ilyVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ilyVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdp apdpVar2 = this.b;
            ilyVar.d = apdpVar2;
            ilyVar.c = 1;
            if (apdpVar2.b(ilyVar) == aoluVar) {
                return aoluVar;
            }
            apdpVar = apdpVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = ilyVar.d;
            aooc.af(obj);
        }
        try {
            java.lang.Long l = this.a;
            if (l == null) {
                l = new java.lang.Long(Long.MIN_VALUE);
            }
            this.a = l;
            return aojh.a;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(aoln aolnVar) {
        defpackage.ilz ilzVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ilz) {
            ilzVar = (defpackage.ilz) aolnVar;
            int i = ilzVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilzVar.c = i - Integer.MIN_VALUE;
            } else {
                ilzVar = new defpackage.ilz(this, aolnVar);
            }
        } else {
            ilzVar = new defpackage.ilz(this, aolnVar);
        }
        java.lang.Object obj = ilzVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ilzVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdp apdpVar2 = this.b;
            ilzVar.d = apdpVar2;
            ilzVar.c = 1;
            if (apdpVar2.b(ilzVar) == aoluVar) {
                return aoluVar;
            }
            apdpVar = apdpVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdpVar = ilzVar.d;
            aooc.af(obj);
        }
        try {
            this.a = null;
            return aojh.a;
        } finally {
            apdpVar.d();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.ihn
    public final java.lang.Object y(amle amleVar, aoln aolnVar) {
        defpackage.ilv ilvVar;
        apdp apdpVar;
        if (aolnVar instanceof defpackage.ilv) {
            ilvVar = (defpackage.ilv) aolnVar;
            int i = ilvVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ilvVar.c = i - Integer.MIN_VALUE;
            } else {
                ilvVar = new defpackage.ilv(this, aolnVar);
            }
        } else {
            ilvVar = new defpackage.ilv(this, aolnVar);
        }
        java.lang.Object obj = ilvVar.a;
        aolu aoluVar = aolu.a;
        int i2 = ilvVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            apdpVar = this.b;
            ilvVar.d = amleVar;
            ilvVar.e = apdpVar;
            ilvVar.c = 1;
            if (apdpVar.b(ilvVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            apdp apdpVar2 = ilvVar.e;
            amle amleVar2 = ilvVar.d;
            aooc.af(obj);
            apdpVar = apdpVar2;
            amleVar = amleVar2;
        }
        try {
            if (this.a != null) {
                amkv amkvVar = amleVar.d;
                if (amkvVar == null) {
                    amkvVar = amkv.a;
                }
                amlg amlgVar = amkvVar.c;
                if (amlgVar == null) {
                    amlgVar = amlg.a;
                }
                this.a = new java.lang.Long(amlgVar.d);
            }
            return aojh.a;
        } finally {
            apdpVar.d();
        }
    }
}
