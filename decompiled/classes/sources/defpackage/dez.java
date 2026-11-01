package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dez {
    public static final void a(android.view.View view, int i, boolean z) {
        da$.ExternalSyntheticApiModelOutline1.m(view, 1);
        da$.ExternalSyntheticApiModelOutline1.m(view, false);
    }

    public static final boolean b() {
        return android.os.Looper.myLooper() == android.os.Looper.getMainLooper();
    }

    public static final defpackage.aolr c() {
        return (defpackage.aolr) defpackage.det.a.a();
    }

    public static /* synthetic */ defpackage.dmp d(int i, defpackage.dnd dndVar) {
        return new defpackage.dnh(i, dndVar, new defpackage.dnb(new defpackage.dmy[0]));
    }

    public static final defpackage.dmq e(defpackage.dmp... dmpVarArr) {
        java.util.List listAsList = java.util.Arrays.asList(dmpVarArr);
        defpackage.aooh.e(listAsList, "asList(...)");
        return new defpackage.dmt(listAsList);
    }

    public static final float f(android.text.Layout layout, int i, android.graphics.Paint paint) {
        float fAbs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        java.lang.ThreadLocal threadLocal = defpackage.dlm.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i)) - lineLeft) + paint.measureText("…");
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null || dlr.a[paragraphAlignment.ordinal()] != 1) {
            fAbs = java.lang.Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        } else {
            fAbs = java.lang.Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        }
        return fAbs + width;
    }

    public static final float g(android.text.Layout layout, int i, android.graphics.Paint paint) {
        float width;
        float width2;
        java.lang.ThreadLocal threadLocal = defpackage.dlm.a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getLineStart(i) + layout.getEllipsisStart(i))) + paint.measureText("…");
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null || dlr.a[paragraphAlignment.ordinal()] != 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - lineRight;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        }
        return width - width2;
    }

    public static final defpackage.gat h(android.content.Context context) {
        return new defpackage.gat(new defpackage.ipc(context, (char[]) null), new defpackage.dmf(android.os.Build.VERSION.SDK_INT >= 31 ? defpackage.dne.a.a(context) : 0), defpackage.dms.a, new defpackage.dmv(defpackage.dms.b, defpackage.aols.a));
    }

    public static final int i(defpackage.gjh gjhVar) throws java.lang.Exception {
        if (gjhVar == null) {
            defpackage.aooh.i("connection");
        }
        defpackage.gin ginVarA = gjhVar.a("SELECT changes()");
        try {
            ginVarA.m();
            int iC = (int) ginVarA.c(0);
            ginVarA.close();
            return iC;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                try {
                    ginVarA.close();
                } catch (java.lang.Throwable th3) {
                    aoil.b(th, th3);
                }
                throw th2;
            }
        }
    }

    public static final long j(defpackage.gjh gjhVar) throws java.lang.Exception {
        defpackage.aooh.f(gjhVar, "connection");
        if (i(gjhVar) == 0) {
            return -1L;
        }
        defpackage.gin ginVarA = gjhVar.a("SELECT last_insert_rowid()");
        try {
            ginVarA.m();
            long jC = ginVarA.c(0);
            defpackage.aooc.M(ginVarA, null);
            return jC;
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.aooc.M(ginVarA, th);
                throw th2;
            }
        }
    }

    public static final java.lang.Object k(java.lang.Class cls) {
        java.lang.String name;
        if (cls == null) {
            defpackage.aooh.i("klass");
        }
        java.lang.Package r0 = cls.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        java.lang.String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            defpackage.aooh.g();
        }
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            defpackage.aooh.e(canonicalName, "substring(...)");
        }
        if (canonicalName == null) {
            defpackage.aooh.i("<this>");
        }
        java.lang.String strReplace = canonicalName.replace('.', '_');
        defpackage.aooh.e(strReplace, "replace(...)");
        java.lang.String strConcat = java.lang.String.valueOf(strReplace).concat("_Impl");
        try {
            java.lang.Class<?> cls2 = java.lang.Class.forName(name.length() == 0 ? strConcat : defpackage.a.bE(strConcat, (byte) 46, name), true, cls.getClassLoader());
            if (cls2 == null) {
                defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            }
            return cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException("Cannot access the constructor ".concat(java.lang.String.valueOf(cls.getCanonicalName())), e2);
        } catch (java.lang.InstantiationException e3) {
            throw new java.lang.RuntimeException("Failed to create an instance of ".concat(java.lang.String.valueOf(cls.getCanonicalName())), e3);
        }
    }

    public static final java.lang.Object l(defpackage.gfy gfyVar, boolean z, defpackage.aoln aolnVar) {
        defpackage.gge ggeVar = (defpackage.gge) aolnVar.u().get(defpackage.gge.b);
        defpackage.aolr aolrVar = ggeVar != null ? ggeVar.a : null;
        if (!gfyVar.r()) {
            defpackage.aolr aolrVarK = gfyVar.k();
            if (aolrVar == null) {
                aolrVar = defpackage.aols.a;
            }
            return aolrVarK.plus(aolrVar);
        }
        if (aolrVar != null) {
            return gfyVar.k().plus(aolrVar);
        }
        if (!z) {
            return gfyVar.k();
        }
        defpackage.aolr aolrVar2 = gfyVar.b;
        if (aolrVar2 != null) {
            return aolrVar2;
        }
        defpackage.aooh.j("transactionContext");
        return null;
    }

    public static final java.lang.Object m(defpackage.gfy gfyVar, boolean z, boolean z2, defpackage.aonj aonjVar) {
        gfyVar.m();
        if (gfyVar.r() && !gfyVar.s()) {
            defpackage.aolr aolrVar = (defpackage.aolr) gfyVar.h.get();
            if ((aolrVar != null ? (defpackage.gge) aolrVar.get(defpackage.gge.b) : null) != null) {
                throw new java.lang.IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            }
        }
        defpackage.aolr aolrVar2 = (defpackage.aolr) gfyVar.h.get();
        if (aolrVar2 == null) {
            aolrVar2 = defpackage.aols.a;
        }
        return q(new defpackage.ghs(aolrVar2, gfyVar, z2, z, aonjVar, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [gfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v1, types: [aonj] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public static final java.lang.Object n(defpackage.gfy gfyVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        defpackage.ght ghtVar;
        ?? r9;
        ?? r8;
        if (aolnVar instanceof defpackage.ght) {
            ghtVar = (defpackage.ght) aolnVar;
            int i = ghtVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ghtVar.d = i - Integer.MIN_VALUE;
            } else {
                ghtVar = new defpackage.ght(aolnVar);
            }
        } else {
            ghtVar = new defpackage.ght(aolnVar);
        }
        java.lang.Object objL = ghtVar.c;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ghtVar.d;
        if (i2 != 0) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    java.lang.Object obj = ghtVar.b;
                    java.lang.Object obj2 = ghtVar.a;
                    defpackage.aooc.af(objL);
                    r8 = obj2;
                    r9 = obj;
                } else if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            defpackage.aooc.af(objL);
            return objL;
        }
        defpackage.aooc.af(objL);
        if (gfyVar.r()) {
            defpackage.eea eeaVar = new defpackage.eea((defpackage.gfy) gfyVar, aonjVar, (defpackage.aoln) null, 4);
            ghtVar.d = 1;
            java.lang.Object objC = defpackage.gfz.c(gfyVar, eeaVar, ghtVar);
            if (objC != aoluVar) {
                return objC;
            }
        } else if (gfyVar.r() && gfyVar.t() && gfyVar.s()) {
            aub aubVar = new aub((defpackage.gfy) gfyVar, (defpackage.aoln) null, aonjVar, 3);
            ghtVar.d = 2;
            java.lang.Object objW = gfyVar.w(aubVar, ghtVar);
            if (objW != aoluVar) {
                return objW;
            }
        } else {
            ghtVar.a = gfyVar;
            ghtVar.b = aonjVar;
            ghtVar.d = 3;
            objL = l(gfyVar, true, ghtVar);
            r8 = gfyVar;
            r9 = aonjVar;
            if (objL != aoluVar) {
            }
        }
        return aoluVar;
        defpackage.bnl bnlVar = new defpackage.bnl((defpackage.aoln) null, (defpackage.gfy) r8, (defpackage.aonj) r9, 15);
        ghtVar.a = null;
        ghtVar.b = null;
        ghtVar.d = 4;
        java.lang.Object objAj = defpackage.aoov.aj((defpackage.aolr) objL, bnlVar, ghtVar);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [aonj] */
    /* JADX WARN: Type inference failed for: r14v2 */
    public static final java.lang.Object o(defpackage.gfy gfyVar, boolean z, boolean z2, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        defpackage.ghu ghuVar;
        boolean z3;
        java.lang.Object objL;
        boolean z4;
        ?? r14;
        java.lang.Object obj;
        if (aolnVar instanceof defpackage.ghu) {
            ghuVar = (defpackage.ghu) aolnVar;
            int i = ghuVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ghuVar.f = i - Integer.MIN_VALUE;
            } else {
                ghuVar = new defpackage.ghu(aolnVar);
            }
        } else {
            ghuVar = new defpackage.ghu(aolnVar);
        }
        defpackage.ghu ghuVar2 = ghuVar;
        java.lang.Object obj2 = ghuVar2.e;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = ghuVar2.f;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    z3 = ghuVar2.d;
                    boolean z5 = ghuVar2.c;
                    java.lang.Object obj3 = ghuVar2.b;
                    java.lang.Object obj4 = ghuVar2.a;
                    defpackage.aooc.af(obj2);
                    z4 = z5;
                    r14 = obj3;
                    objL = obj2;
                    obj = obj4;
                } else if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            defpackage.aooc.af(obj2);
            return obj2;
        }
        defpackage.aooc.af(obj2);
        if (gfyVar.r() && gfyVar.t() && gfyVar.s()) {
            defpackage.ghw ghwVar = new defpackage.ghw(z2, z, gfyVar, null, aonjVar, 0);
            ghuVar2.f = 1;
            java.lang.Object objW = gfyVar.w(ghwVar, ghuVar2);
            if (objW != aoluVar) {
                return objW;
            }
        } else {
            defpackage.gfy gfyVar2 = gfyVar;
            z3 = z2;
            ghuVar2.a = gfyVar2;
            ghuVar2.b = aonjVar;
            ghuVar2.c = z;
            ghuVar2.d = z3;
            ghuVar2.f = 2;
            objL = l(gfyVar2, z3, ghuVar2);
            if (objL != aoluVar) {
                z4 = z;
                r14 = aonjVar;
                obj = gfyVar2;
            }
        }
        return aoluVar;
        defpackage.ghr ghrVar = new defpackage.ghr((defpackage.aoln) null, (defpackage.gfy) obj, z4, z3, (defpackage.aonj) r14, 2);
        ghuVar2.a = null;
        ghuVar2.b = null;
        ghuVar2.f = 3;
        java.lang.Object objAj = defpackage.aoov.aj((defpackage.aolr) objL, ghrVar, ghuVar2);
        if (objAj != aoluVar) {
            return objAj;
        }
        return aoluVar;
    }

    public static final defpackage.ajcq p(defpackage.gfy gfyVar, boolean z, boolean z2, defpackage.aonj aonjVar) {
        return defpackage.aosv.F(gfyVar.l(), 0, new defpackage.ghr(gfyVar, z, z2, aonjVar, null, 1, null), 3);
    }

    public static final java.lang.Object q(defpackage.aonn aonnVar) {
        java.lang.Thread.interrupted();
        return defpackage.aoov.ah(defpackage.aols.a, new defpackage.ghq(aonnVar, (defpackage.aoln) null, 1));
    }

    public static final java.lang.String r(java.lang.String str, java.lang.String str2) {
        return "room_table_modification_trigger_" + str + '_' + str2;
    }

    public static final java.lang.Object s(defpackage.gfs gfsVar, java.lang.String str, defpackage.aoln aolnVar) {
        java.lang.Object objA = gfsVar.a(str, new defpackage.een(6), aolnVar);
        return objA != defpackage.aolu.a ? defpackage.aojh.a : objA;
    }

    public static final defpackage.ggd t(defpackage.giv givVar) {
        defpackage.ggd ggdVar;
        defpackage.gio gioVar = (defpackage.gio) givVar;
        java.lang.Object[] objArr = gioVar.b;
        int length = objArr != null ? objArr.length : 0;
        java.lang.String str = gioVar.a;
        if (str == null) {
            defpackage.aooh.i("query");
        }
        java.util.TreeMap treeMap = defpackage.ggd.a;
        synchronized (treeMap) {
            java.util.Map.Entry entryCeilingEntry = treeMap.ceilingEntry(java.lang.Integer.valueOf(length));
            if (entryCeilingEntry != null) {
                treeMap.remove(entryCeilingEntry.getKey());
                ggdVar = (defpackage.ggd) entryCeilingEntry.getValue();
                ggdVar.h(str, length);
                if (ggdVar == null) {
                    defpackage.aooh.g();
                }
            } else {
                ggdVar = new defpackage.ggd(length);
                ggdVar.h(str, length);
            }
        }
        givVar.g(new defpackage.ggc(ggdVar));
        return ggdVar;
    }
}
