package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lwr implements tev {
    public final teo a;
    private final defpackage.lxa b;
    private final android.content.Context c;
    private final aenj d;

    public lwr(defpackage.lxa lxaVar, android.content.Context context) {
        aooh.f(context, "appContext");
        this.b = lxaVar;
        this.c = context;
        this.a = teo.e;
        this.d = new aenj("ExtendedDirectorySearchSection");
    }

    public final aenj a() {
        return this.d;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(tet tetVar, tej tejVar, aoln aolnVar) throws aois {
        defpackage.lwq lwqVar;
        java.lang.String str;
        if (aolnVar instanceof defpackage.lwq) {
            lwqVar = (defpackage.lwq) aolnVar;
            int i = lwqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwqVar.c = i - Integer.MIN_VALUE;
            } else {
                lwqVar = new defpackage.lwq(this, aolnVar);
            }
        } else {
            lwqVar = new defpackage.lwq(this, aolnVar);
        }
        defpackage.lwq lwqVar2 = lwqVar;
        java.lang.Object objB = lwqVar2.a;
        aolu aoluVar = aolu.a;
        int i2 = lwqVar2.c;
        if (i2 == 0) {
            aooc.af(objB);
            if (!(tetVar instanceof teq)) {
                return null;
            }
            defpackage.lwj lwjVar = (defpackage.lwj) ((teq) tetVar).a;
            j$.util.Objects.checkIndex(0, 3);
            if (lwjVar != null) {
                if (lwjVar instanceof defpackage.lwi) {
                    defpackage.lwi lwiVar = (defpackage.lwi) lwjVar;
                    boolean z = lwiVar.c;
                    android.content.Context context = this.c;
                    java.lang.String string = z ? context.getString(2132018330) : context.getString(2132018328, lwiVar.b);
                    aooh.c(string);
                    return new defpackage.lxi(lwiVar.a, string);
                }
                if (lwjVar instanceof defpackage.lwh) {
                    defpackage.lwh lwhVar = (defpackage.lwh) lwjVar;
                    tin tinVar = lwhVar.a;
                    defpackage.lwi lwiVar2 = lwhVar.b;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    long j = lwiVar2.a;
                    sb.append(j);
                    sb.append('_');
                    sb.append(tinVar.a);
                    java.lang.String string2 = sb.toString();
                    java.lang.Long l = new java.lang.Long(j);
                    lwqVar2.d = string2;
                    lwqVar2.c = 1;
                    objB = this.b.b(tinVar, tejVar, 4, l, lwqVar2);
                    if (objB == aoluVar) {
                        return aoluVar;
                    }
                    str = string2;
                }
            }
            throw new aois();
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = lwqVar2.d;
        aooc.af(objB);
        return new defpackage.lwg(str, (tfn) objB);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.lws lwsVar, aoln aolnVar) throws aois {
        defpackage.lwp lwpVar;
        defpackage.lwg lwgVar;
        if (aolnVar instanceof defpackage.lwp) {
            lwpVar = (defpackage.lwp) aolnVar;
            int i = lwpVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lwpVar.c = i - Integer.MIN_VALUE;
            } else {
                lwpVar = new defpackage.lwp(this, aolnVar);
            }
        } else {
            lwpVar = new defpackage.lwp(this, aolnVar);
        }
        java.lang.Object objA = lwpVar.a;
        aolu aoluVar = aolu.a;
        int i2 = lwpVar.c;
        if (i2 == 0) {
            aooc.af(objA);
            int iBG = mni.bG(lwsVar);
            if (iBG == 0) {
                return null;
            }
            if (iBG != 1) {
                throw new aois();
            }
            defpackage.lwg lwgVar2 = (defpackage.lwg) lwsVar;
            defpackage.lxa lxaVar = this.b;
            tfn tfnVar = lwgVar2.b;
            lwpVar.d = lwgVar2;
            lwpVar.c = 1;
            objA = lxaVar.a(tfnVar, lwpVar);
            if (objA == aoluVar) {
                return aoluVar;
            }
            lwgVar = lwgVar2;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lwgVar = lwpVar.d;
            aooc.af(objA);
        }
        tfn tfnVar2 = (tfn) objA;
        java.lang.String str = lwgVar.a;
        aooh.f(str, "id");
        aooh.f(tfnVar2, "searchResultData");
        return new defpackage.lwg(str, tfnVar2);
    }

    public final void d(java.lang.String str, cav cavVar, int i) {
        int i2;
        cav cavVar2;
        int i3 = i & 6;
        cav cavVarB = cavVar.b(-316588570);
        if (i3 == 0) {
            i2 = i | (true != cavVarB.B(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if (cavVarB.H((i2 & 3) != 2, i2 & 1)) {
            cavVar2 = cavVarB;
            abrz.k(str, den.ba(azm.o(azm.f(azm.d(cmw.c, 1.0f), 46.0f, Float.NaN), cmh.n, 2), 32.0f, 0.0f, 0.0f, 0.0f), den.ak(cavVarB).a, 0L, (dnd) null, (dmq) null, 0L, (dot) null, 0L, 2, false, 1, 0, (aonj) null, den.an(cavVarB).m, cavVar2, (i2 & 14) | 48, 24960, 110584);
        } else {
            cavVar2 = cavVarB;
            cavVar2.s();
        }
        cdk cdkVarI = cavVar2.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kcv(this, str, i, 14, null);
        }
    }

    public final void e(defpackage.lws lwsVar, ten tenVar, cav cavVar, int i) {
        int i2;
        ten tenVar2;
        int i3 = i & 6;
        cbt cbtVarB = cavVar.b(381276017);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cbtVarB.B(lwsVar) : cbtVarB.D(lwsVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? cbtVarB.B(tenVar) : cbtVarB.D(tenVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cbtVarB.D(this) ? 128 : 256;
        }
        if (cbtVarB.H((i2 & 147) != 146, i2 & 1)) {
            int iBG = mni.bG(lwsVar);
            if (iBG == 0) {
                tenVar2 = tenVar;
                cbtVarB.u(1334036022);
                d(((defpackage.lxi) lwsVar).a, cbtVarB, (i2 >> 3) & 112);
                cbtVarB.W(false);
            } else {
                if (iBG != 1) {
                    cbtVarB.u(1334035154);
                    cbtVarB.W(false);
                    throw new aois();
                }
                cbtVarB.u(1334038837);
                tenVar2 = tenVar;
                snl.aD((cmw) null, tenVar2, tfo.a(((defpackage.lwg) lwsVar).b, tenVar.c), (aonn) null, cbtVarB, i2 & 112);
                cbtVarB.W(false);
            }
        } else {
            tenVar2 = tenVar;
            cbtVarB.s();
        }
        cdk cdkVarI = cbtVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.kko(this, lwsVar, tenVar2, i, 17);
        }
    }
}
