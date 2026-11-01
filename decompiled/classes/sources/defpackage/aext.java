package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aext {
    public static final defpackage.aext a = new defpackage.aext(defpackage.aexr.a, defpackage.aexm.a);
    public final defpackage.aexr b;
    public final defpackage.aexm c;

    private aext(defpackage.aexr aexrVar, defpackage.aexm aexmVar) {
        aexrVar.getClass();
        this.b = aexrVar;
        this.c = aexmVar;
    }

    public static defpackage.aext c(defpackage.akzf akzfVar) throws defpackage.alaz {
        defpackage.aexr aexrVarA;
        int iL = akzfVar.l();
        if (iL > 1) {
            throw new defpackage.alaz(defpackage.a.bs(iL, "Unsupported version: ", ". Current version is: 1"));
        }
        akzfVar.l();
        int iF = akzfVar.f(akzfVar.o());
        defpackage.alad aladVarD = defpackage.alad.D(defpackage.aexm.a, akzfVar, defpackage.akzq.a);
        defpackage.alad.V(aladVarD);
        defpackage.aexm aexmVar = (defpackage.aexm) aladVarD;
        akzfVar.B(iF);
        defpackage.aexp aexpVar = new defpackage.aexp(0);
        try {
            int iO = akzfVar.o();
            if (iO > 12288) {
                int iF2 = akzfVar.f(iO);
                try {
                    aexrVarA = defpackage.aexr.a(new defpackage.akze(new java.util.zip.InflaterInputStream(new aexo(aexpVar, akzfVar), (java.util.zip.Inflater) aexpVar.a, 4096), 4096));
                    ((java.util.zip.Inflater) aexpVar.a).reset();
                    int iD = akzfVar.d();
                    if (iD > 0) {
                        akzfVar.C(iD);
                    }
                    akzfVar.B(iF2);
                } catch (java.lang.Throwable th) {
                    ((java.util.zip.Inflater) aexpVar.a).reset();
                    throw th;
                }
            } else {
                ((java.util.zip.Inflater) aexpVar.a).setInput(akzfVar.G(iO));
                try {
                    aexrVarA = defpackage.aexr.a(new defpackage.akze(new defpackage.aexn(aexpVar), 4096));
                    ((java.util.zip.Inflater) aexpVar.a).reset();
                } catch (java.lang.Throwable th2) {
                    ((java.util.zip.Inflater) aexpVar.a).reset();
                    throw th2;
                }
            }
            aexpVar.close();
            return new defpackage.aext(aexrVarA, aexmVar);
        } catch (java.lang.Throwable th3) {
            try {
                aexpVar.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final long a() {
        return this.c.e;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x020a  */
    public final defpackage.aexr b() {
        defpackage.aigf aigfVarE;
        long j;
        defpackage.aexm aexmVar = this.c;
        int size = aexmVar.f.size();
        defpackage.aexr aexrVar = this.b;
        if (size <= 0) {
            return aexrVar;
        }
        java.util.Collection<defpackage.aexh> collectionValues = j$.util.DesugarCollections.unmodifiableMap(aexmVar.f).values();
        int i = 0;
        int i2 = 1;
        if (collectionValues == null) {
            aigfVarE = defpackage.aikj.b;
        } else {
            defpackage.aigb aigbVar = new defpackage.aigb(4);
            for (defpackage.aexh aexhVar : collectionValues) {
                int i3 = aexhVar.c;
                int iAs = defpackage.agab.as(i3);
                if (iAs == 0) {
                    throw null;
                }
                int i4 = iAs - 1;
                if (i4 == 0) {
                    aigbVar.i(aexhVar.e, java.lang.Long.valueOf(i3 == 1 ? ((java.lang.Long) aexhVar.d).longValue() : 0L));
                } else if (i4 == 1) {
                    aigbVar.i(aexhVar.e, java.lang.Boolean.valueOf(i3 == 2 ? ((java.lang.Boolean) aexhVar.d).booleanValue() : false));
                } else if (i4 == 2) {
                    aigbVar.i(aexhVar.e, java.lang.Double.valueOf(i3 == 3 ? ((java.lang.Double) aexhVar.d).doubleValue() : 0.0d));
                } else if (i4 == 3) {
                    aigbVar.i(aexhVar.e, i3 == 4 ? (java.lang.String) aexhVar.d : "");
                } else {
                    if (i4 != 4) {
                        throw new java.lang.IllegalStateException("Could not serialize Flag for override: ".concat(java.lang.String.valueOf(aexhVar.e)));
                    }
                    aigbVar.i(aexhVar.e, (i3 == 5 ? (defpackage.akzc) aexhVar.d : defpackage.akzc.d).D());
                }
            }
            aigfVarE = aigbVar.e(false);
        }
        if (aigfVarE.isEmpty()) {
            return aexrVar;
        }
        java.util.HashMap map = new java.util.HashMap(aigfVarE);
        defpackage.aihm aihmVar = new defpackage.aihm(defpackage.aiju.a);
        defpackage.ailj it = aexrVar.b.iterator();
        while (it.hasNext()) {
            defpackage.aexq aexqVar = (defpackage.aexq) it.next();
            java.lang.Object objRemove = map.remove(aexqVar.c());
            if (objRemove == null) {
                aihmVar.n(aexqVar);
            } else if (objRemove instanceof java.lang.String) {
                aihmVar.n(new defpackage.aexq(aexqVar.a, aexqVar.b, 4, 0L, objRemove));
            } else if (objRemove instanceof byte[]) {
                aihmVar.n(new defpackage.aexq(aexqVar.a, aexqVar.b, 5, 0L, objRemove));
            } else if (objRemove instanceof java.lang.Boolean) {
                aihmVar.n(new defpackage.aexq(aexqVar.a, aexqVar.b, ((java.lang.Boolean) objRemove).booleanValue() ? 1 : 0, 0L, null));
            } else if (objRemove instanceof java.lang.Long) {
                aihmVar.n(new defpackage.aexq(aexqVar.a, aexqVar.b, 2, ((java.lang.Long) objRemove).longValue(), null));
            } else {
                if (!(objRemove instanceof java.lang.Double)) {
                    throw new java.lang.IllegalStateException("Cannot serialize override for existing flag " + aexqVar.c() + ": " + objRemove.toString());
                }
                aihmVar.n(new defpackage.aexq(aexqVar.a, aexqVar.b, 3, java.lang.Double.doubleToRawLongBits(((java.lang.Double) objRemove).doubleValue()), null));
            }
        }
        for (java.lang.String str : map.keySet()) {
            java.lang.Object obj = map.get(str);
            int length = str.length();
            if (length > 19 || length == 0) {
                j = 0;
                break;
            }
            long jCharAt = str.charAt(i) - '0';
            if (jCharAt < 1 || jCharAt > 9) {
                j = 0;
                break;
            }
            int i5 = i2;
            while (true) {
                if (i5 >= length) {
                    if (jCharAt >= 0 && jCharAt <= 2305843009213693951L) {
                        j = jCharAt;
                        break;
                    }
                    break;
                }
                int iCharAt = str.charAt(i5) - '0';
                if (((iCharAt >>> 31) | (iCharAt > 9 ? i2 : i)) == 0) {
                    jCharAt = (jCharAt * 10) + ((long) iCharAt);
                    i5++;
                    i = 0;
                    i2 = 1;
                }
                j = 0;
                break;
            }
            java.lang.String str2 = j == 0 ? str : null;
            if (obj instanceof java.lang.String) {
                aihmVar.n(new defpackage.aexq(j, str2, 4, 0L, obj));
            } else if (obj instanceof byte[]) {
                aihmVar.n(new defpackage.aexq(j, str2, 5, 0L, obj));
            } else if (obj instanceof java.lang.Boolean) {
                aihmVar.n(new defpackage.aexq(j, str2, ((java.lang.Boolean) obj).booleanValue() ? 1 : 0, 0L, null));
            } else if (obj instanceof java.lang.Long) {
                aihmVar.n(new defpackage.aexq(j, str2, 2, ((java.lang.Long) obj).longValue(), null));
            } else {
                if (!(obj instanceof java.lang.Double)) {
                    throw new java.lang.IllegalStateException(defpackage.hgb.l(obj, str, "Cannot serialize override ", ": "));
                }
                aihmVar.n(new defpackage.aexq(j, str2, 3, java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()), null));
            }
            i = 0;
            i2 = 1;
        }
        return new defpackage.aexr(aihmVar.g());
    }

    public final defpackage.akzc d() {
        return this.c.c;
    }

    public final java.lang.String e() {
        return this.c.d;
    }

    public final java.lang.String f() {
        return this.c.b;
    }

    public final java.util.Map g() {
        defpackage.aexm aexmVar = this.c;
        if (aexmVar.f.size() == 0) {
            return null;
        }
        return j$.util.DesugarCollections.unmodifiableMap(aexmVar.f);
    }
}
