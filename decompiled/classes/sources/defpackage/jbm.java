package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jbm {
    private static final defpackage.aimz g = defpackage.aimz.i("com/android/dialer/beesly/impl/settings/service/BeeslySettings");
    public final defpackage.aoin a;
    public final defpackage.aoin b;
    public final defpackage.aoin c;
    public final defpackage.aoin d;
    public final defpackage.aoin e;
    public final defpackage.aoin f;
    private final android.content.Context h;
    private final defpackage.aolr i;
    private final defpackage.ecx j;
    private final defpackage.zjs k;
    private final defpackage.aoin l;
    private final defpackage.okj m;
    private final defpackage.oko n;
    private final defpackage.jcg o;
    private final defpackage.aoin p;
    private final defpackage.aoin q;
    private final defpackage.zjm r;
    private final defpackage.zjm s;

    public jbm(android.content.Context context, defpackage.aolr aolrVar, defpackage.ecx ecxVar, defpackage.zjs zjsVar, defpackage.zjm zjmVar, defpackage.zjm zjmVar2, defpackage.aoin aoinVar, defpackage.okj okjVar, defpackage.oko okoVar, defpackage.jcg jcgVar, defpackage.aoin aoinVar2, defpackage.aoin aoinVar3, defpackage.aoin aoinVar4, defpackage.aoin aoinVar5, defpackage.aoin aoinVar6, defpackage.aoin aoinVar7, defpackage.aoin aoinVar8, defpackage.aoin aoinVar9) {
        defpackage.aooh.f(context, "context");
        defpackage.aooh.f(aolrVar, "backgroundContext");
        defpackage.aooh.f(ecxVar, "beeslySettingsDataStore");
        defpackage.aooh.f(zjsVar, "dialerTelecom");
        defpackage.aooh.f(aoinVar, "enableI18nAlgorithm");
        defpackage.aooh.f(aoinVar2, "consecutiveBeeslyTriggersToIncreaseTimeout");
        defpackage.aooh.f(aoinVar3, "consecutiveFailedBeeslyTriggersToDecreaseTimeout");
        defpackage.aooh.f(aoinVar4, "maxTimeoutSeconds");
        defpackage.aooh.f(aoinVar5, "minTimeoutSeconds");
        defpackage.aooh.f(aoinVar6, "timeoutDropRate");
        defpackage.aooh.f(aoinVar7, "timeoutIncreaseMs");
        defpackage.aooh.f(aoinVar8, "deferBeeslyEnrollment");
        defpackage.aooh.f(aoinVar9, "autoDisableTamForO2Cz");
        this.h = context;
        this.i = aolrVar;
        this.j = ecxVar;
        this.k = zjsVar;
        this.r = zjmVar;
        this.s = zjmVar2;
        this.l = aoinVar;
        this.m = okjVar;
        this.n = okoVar;
        this.o = jcgVar;
        this.a = aoinVar2;
        this.b = aoinVar3;
        this.c = aoinVar4;
        this.d = aoinVar5;
        this.e = aoinVar6;
        this.f = aoinVar7;
        this.p = aoinVar8;
        this.q = aoinVar9;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(android.telecom.PhoneAccountHandle phoneAccountHandle, boolean z, defpackage.aoln aolnVar) {
        jay jayVar;
        if (aolnVar instanceof jay) {
            jayVar = (jay) aolnVar;
            int i = jayVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jayVar.d = i - Integer.MIN_VALUE;
            } else {
                jayVar = new jay(this, aolnVar);
            }
        } else {
            jayVar = new jay(this, aolnVar);
        }
        java.lang.Object objD = jayVar.b;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jayVar.d;
        if (i2 != 0) {
            if (i2 == 1) {
                z = jayVar.a;
                phoneAccountHandle = jayVar.e;
                defpackage.aooc.af(objD);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objD);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(objD);
        jayVar.e = phoneAccountHandle;
        jayVar.a = z;
        jayVar.d = 1;
        objD = d(phoneAccountHandle, jayVar);
        if (objD == aoluVar) {
            return aoluVar;
        }
        android.telecom.PhoneAccountHandle phoneAccountHandle2 = phoneAccountHandle;
        boolean z2 = z;
        int iIntValue = ((java.lang.Number) objD).intValue();
        defpackage.ecx ecxVar = this.j;
        jaz jazVar = new jaz(this, phoneAccountHandle2, z2, iIntValue, (defpackage.aoln) null);
        jayVar.e = null;
        jayVar.d = 2;
        if (ecxVar.a(jazVar, jayVar) == aoluVar) {
            return aoluVar;
        }
        return defpackage.aojh.a;
    }

    public final java.lang.Object b(defpackage.aoln aolnVar) {
        return defpackage.aoov.au(this.j.b(), aolnVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        jba jbaVar;
        java.lang.Object next;
        long jIntValue;
        if (aolnVar instanceof jba) {
            jbaVar = (jba) aolnVar;
            int i = jbaVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbaVar.c = i - Integer.MIN_VALUE;
            } else {
                jbaVar = new jba(this, aolnVar);
            }
        } else {
            jbaVar = new jba(this, aolnVar);
        }
        java.lang.Object objB = jbaVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jbaVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                phoneAccountHandle = jbaVar.d;
                defpackage.aooc.af(objB);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objB);
            }
            jIntValue = ((java.lang.Number) objB).intValue();
            return new java.lang.Long(jIntValue);
        }
        defpackage.aooc.af(objB);
        jbaVar.d = phoneAccountHandle;
        jbaVar.c = 1;
        objB = b(jbaVar);
        if (objB == aoluVar) {
            return aoluVar;
        }
        defpackage.alat alatVar = ((defpackage.jbr) objB).j;
        defpackage.aooh.e(alatVar, "getBeeslyTimeoutDataList(...)");
        java.util.Iterator<E> it = alatVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            defpackage.jbo jboVar = (defpackage.jbo) next;
            defpackage.jbq jbqVar = jboVar.c;
            if (jbqVar == null) {
                jbqVar = defpackage.jbq.a;
            }
            if (defpackage.aooh.n(jbqVar.d, phoneAccountHandle.getId())) {
                defpackage.jbq jbqVar2 = jboVar.c;
                if (jbqVar2 == null) {
                    jbqVar2 = defpackage.jbq.a;
                }
                if (defpackage.aooh.n(jbqVar2.c, phoneAccountHandle.getComponentName().flattenToString())) {
                    break;
                }
            }
        }
        defpackage.jbo jboVar2 = (defpackage.jbo) next;
        if (jboVar2 != null) {
            jIntValue = jboVar2.d;
        } else {
            jbaVar.d = null;
            jbaVar.c = 2;
            objB = d(phoneAccountHandle, jbaVar);
            if (objB == aoluVar) {
                return aoluVar;
            }
            jIntValue = ((java.lang.Number) objB).intValue();
        }
        return new java.lang.Long(jIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x009b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(android.telecom.PhoneAccountHandle phoneAccountHandle, defpackage.aoln aolnVar) {
        jbb jbbVar;
        java.lang.Integer num;
        java.lang.Integer numValueOf;
        java.lang.Long lB;
        defpackage.oko okoVar;
        java.lang.String upperCase;
        java.lang.Integer numValueOf2;
        java.lang.Long lC;
        java.lang.String str;
        if (aolnVar instanceof jbb) {
            jbbVar = (jbb) aolnVar;
            int i = jbbVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbbVar.c = i - Integer.MIN_VALUE;
            } else {
                jbbVar = new jbb(this, aolnVar);
            }
        } else {
            jbbVar = new jbb(this, aolnVar);
        }
        java.lang.Object objO = jbbVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jbbVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                phoneAccountHandle = jbbVar.d;
                defpackage.aooc.af(objO);
            } else {
                if (i2 == 2) {
                    phoneAccountHandle = jbbVar.d;
                    defpackage.aooc.af(objO);
                    num = (java.lang.Integer) objO;
                    if (num != null || (lB = this.o.b(num.intValue())) == null) {
                        numValueOf = null;
                    } else {
                        numValueOf = java.lang.Integer.valueOf(defpackage.jcg.d(lB.longValue()));
                    }
                    if (numValueOf != null) {
                        return numValueOf;
                    }
                    defpackage.oko okoVar2 = this.n;
                    jbbVar.d = null;
                    jbbVar.c = 3;
                    objO = okoVar2.O(phoneAccountHandle, jbbVar);
                    if (objO == aoluVar) {
                        return aoluVar;
                    }
                    okoVar = (defpackage.oko) objO;
                    if (okoVar != null) {
                        jbbVar.c = 4;
                        objO = okoVar.I(jbbVar);
                        if (objO == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        upperCase = null;
                    }
                    if (upperCase != null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 == null) {
                        return new java.lang.Integer(20000);
                    }
                    return numValueOf2;
                }
                if (i2 == 3) {
                    defpackage.aooc.af(objO);
                    okoVar = (defpackage.oko) objO;
                    if (okoVar != null) {
                        jbbVar.c = 4;
                        objO = okoVar.I(jbbVar);
                        if (objO == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        upperCase = null;
                    }
                    if (upperCase != null || (lC = this.o.c(upperCase)) == null) {
                        numValueOf2 = null;
                    } else {
                        numValueOf2 = java.lang.Integer.valueOf(defpackage.jcg.d(lC.longValue()));
                    }
                    if (numValueOf2 == null) {
                        return new java.lang.Integer(20000);
                    }
                    return numValueOf2;
                }
                if (i2 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(objO);
            }
            str = (java.lang.String) objO;
            if (str != null) {
                upperCase = str.toUpperCase(java.util.Locale.ROOT);
                defpackage.aooh.e(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
            if (upperCase != null) {
                numValueOf2 = null;
            } else {
                numValueOf2 = null;
            }
            if (numValueOf2 == null) {
                return new java.lang.Integer(20000);
            }
            return numValueOf2;
        }
        defpackage.aooc.af(objO);
        defpackage.oko okoVar3 = this.n;
        jbbVar.d = phoneAccountHandle;
        jbbVar.c = 1;
        objO = okoVar3.O(phoneAccountHandle, jbbVar);
        if (objO == aoluVar) {
            return aoluVar;
        }
        defpackage.oko okoVar4 = (defpackage.oko) objO;
        if (okoVar4 != null) {
            jbbVar.d = phoneAccountHandle;
            jbbVar.c = 2;
            objO = okoVar4.J(jbbVar);
            if (objO == aoluVar) {
                return aoluVar;
            }
            num = (java.lang.Integer) objO;
        } else {
            num = null;
        }
        if (num != null) {
            numValueOf = null;
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf;
        }
        defpackage.oko okoVar5 = this.n;
        jbbVar.d = null;
        jbbVar.c = 3;
        objO = okoVar5.O(phoneAccountHandle, jbbVar);
        if (objO == aoluVar) {
            return aoluVar;
        }
        okoVar = (defpackage.oko) objO;
        if (okoVar != null) {
            jbbVar.c = 4;
            objO = okoVar.I(jbbVar);
            if (objO == aoluVar) {
                return aoluVar;
            }
            str = (java.lang.String) objO;
            if (str != null) {
                upperCase = str.toUpperCase(java.util.Locale.ROOT);
                defpackage.aooh.e(upperCase, "toUpperCase(...)");
            } else {
                upperCase = null;
            }
        } else {
            upperCase = null;
        }
        if (upperCase != null) {
            numValueOf2 = null;
        } else {
            numValueOf2 = null;
        }
        if (numValueOf2 == null) {
            return new java.lang.Integer(20000);
        }
        return numValueOf2;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0084 -> B:36:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0090 -> B:33:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(int r8, defpackage.aoln r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof jbc
            if (r0 == 0) goto L13
            r0 = r9
            jbc r0 = (jbc) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            jbc r0 = new jbc
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            aolu r1 = defpackage.aolu.a
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            int r8 = r0.a
            java.lang.Object r2 = r0.b
            defpackage.aooc.af(r9)
            goto L92
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            int r8 = r0.a
            java.lang.Object r2 = r0.b
            defpackage.aooc.af(r9)
            goto L82
        L41:
            int r8 = r0.a
            defpackage.aooc.af(r9)
            goto L56
        L47:
            defpackage.aooc.af(r9)
            okj r9 = r7.m
            r0.a = r8
            r0.e = r5
            java.lang.Object r9 = r9.i(r0)
            if (r9 == r1) goto La1
        L56:
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L5d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto La1
        L5d:
            java.util.Iterator r9 = r9.iterator()
        L61:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L9f
            java.lang.Object r2 = r9.next()
            android.telephony.SubscriptionInfo r2 = (android.telephony.SubscriptionInfo) r2
            oko r5 = r7.n
            int r2 = r2.getSubscriptionId()
            r0.b = r9
            r0.a = r8
            r0.e = r4
            java.lang.Object r2 = r5.Q(r2, r0)
            if (r2 == r1) goto La1
            r6 = r2
            r2 = r9
            r9 = r6
        L82:
            oko r9 = (defpackage.oko) r9
            if (r9 == 0) goto L9d
            r0.b = r2
            r0.a = r8
            r0.e = r3
            java.lang.Object r9 = r9.J(r0)
            if (r9 == r1) goto La1
        L92:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 != r8) goto L9d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            goto La1
        L9d:
            r9 = r2
            goto L61
        L9f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbm.e(int, aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(defpackage.aoln aolnVar) {
        jbd jbdVar;
        if (aolnVar instanceof jbd) {
            jbdVar = (jbd) aolnVar;
            int i = jbdVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbdVar.c = i - Integer.MIN_VALUE;
            } else {
                jbdVar = new jbd(this, aolnVar);
            }
        } else {
            jbdVar = new jbd(this, aolnVar);
        }
        java.lang.Object objAj = jbdVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jbdVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            java.lang.Object systemService = this.h.getSystemService("restrictions");
            defpackage.aooh.d(systemService, "null cannot be cast to non-null type android.content.RestrictionsManager");
            defpackage.aolr aolrVar = this.i;
            icr icrVar = new icr((android.content.RestrictionsManager) systemService, (defpackage.aoln) null, 15);
            jbdVar.c = 1;
            objAj = defpackage.aoov.aj(aolrVar, icrVar, jbdVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
        }
        android.os.Bundle bundle = (android.os.Bundle) objAj;
        return java.lang.Boolean.valueOf(bundle != null && bundle.containsKey("disable_beesly") && bundle.getBoolean("disable_beesly"));
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:62:0x010b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x0117  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:73:0x0137  */
    /* JADX WARN: Code duplicated, block: B:79:0x0161  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x016c  */
    /* JADX WARN: Code duplicated, block: B:84:0x017a  */
    /* JADX WARN: Code duplicated, block: B:88:0x018e  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e1  */
    public final java.lang.Object g(defpackage.aoln aolnVar) throws java.lang.Throwable {
        jbe jbeVar;
        jbn jbnVarB;
        defpackage.ecx ecxVar;
        defpackage.bpj bpjVar;
        jbn jbnVar;
        jbn jbnVarB2;
        jbn jbnVarB3;
        jbn jbnVarB4;
        int iOrdinal;
        jbn jbnVar2;
        jbn jbnVar3;
        boolean zBooleanValue;
        defpackage.aimz aimzVar;
        jbn jbnVar4;
        jbn jbnVar5;
        if (aolnVar instanceof jbe) {
            jbeVar = (jbe) aolnVar;
            int i = jbeVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbeVar.c = i - Integer.MIN_VALUE;
            } else {
                jbeVar = new jbe(this, aolnVar);
            }
        } else {
            jbeVar = new jbe(this, aolnVar);
        }
        java.lang.Object objF = jbeVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        boolean z = true;
        switch (jbeVar.c) {
            case 0:
                defpackage.aooc.af(objF);
                jbeVar.c = 1;
                objF = f(jbeVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objF).booleanValue()) {
                    jbeVar.c = 2;
                    objF = b(jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    jbnVarB = jbn.b(((defpackage.jbr) objF).c);
                    if (jbnVarB == null) {
                        jbnVarB = jbn.e;
                    }
                    if (jbnVarB != jbn.d) {
                        ecxVar = this.j;
                        bpjVar = new defpackage.bpj(jbnVarB, (defpackage.aoln) null, 11);
                        jbeVar.c = 3;
                        if (ecxVar.a(bpjVar, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    jbnVar = jbn.d;
                    jbeVar.c = 4;
                    if (l(jbnVar, jbeVar) == aoluVar) {
                        return aoluVar;
                    }
                    return java.lang.Boolean.FALSE;
                }
                jbeVar.c = 5;
                objF = b(jbeVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                jbnVarB2 = jbn.b(((defpackage.jbr) objF).c);
                if (jbnVarB2 == null) {
                    jbnVarB2 = jbn.e;
                }
                if (jbnVarB2 == jbn.d) {
                    jbeVar.c = 6;
                    objF = b(jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    jbnVarB3 = jbn.b(((defpackage.jbr) objF).i);
                    if (jbnVarB3 == null) {
                        jbnVarB3 = jbn.e;
                    }
                    jbeVar.c = 7;
                    if (l(jbnVarB3, jbeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                jbeVar.c = 8;
                objF = b(jbeVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                jbnVarB4 = jbn.b(((defpackage.jbr) objF).c);
                if (jbnVarB4 == null) {
                    jbnVarB4 = jbn.e;
                }
                iOrdinal = jbnVarB4.ordinal();
                if (iOrdinal != 0) {
                    if (((java.lang.Boolean) this.p.a()).booleanValue()) {
                        jbeVar.c = 9;
                        objF = h(jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) objF).booleanValue()) {
                            ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 106, "BeeslySettings.kt")).v("SIM is not ready yet, deferring enrollment check");
                            return java.lang.Boolean.FALSE;
                        }
                    }
                    jbeVar.c = 10;
                    objF = e(1839, jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objF).booleanValue()) {
                        jbnVar2 = jbn.c;
                        jbeVar.c = 11;
                        if (l(jbnVar2, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        if (((java.lang.Boolean) this.q.a()).booleanValue()) {
                            jbeVar.c = 12;
                            objF = e(1449, jbeVar);
                            if (objF == aoluVar) {
                                return aoluVar;
                            }
                            if (!((java.lang.Boolean) objF).booleanValue()) {
                                ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 115, "BeeslySettings.kt")).v("Beesly is opted out for O2 CZ SIM");
                                jbnVar3 = jbn.c;
                                jbeVar.c = 13;
                                if (l(jbnVar3, jbeVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                        jbeVar.c = 14;
                        objF = i(jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                        aimzVar = g;
                        if (zBooleanValue) {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 120, "BeeslySettings.kt")).v("Beesly is opted out as VVM is enabled");
                            jbnVar5 = jbn.c;
                            jbeVar.c = 15;
                            if (l(jbnVar5, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 125, "BeeslySettings.kt")).v("Beesly is auto enrolled as VVM is disabled");
                            jbnVar4 = jbn.b;
                            jbeVar.c = 16;
                            if (l(jbnVar4, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    z = false;
                } else if (iOrdinal != 1) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 1:
                defpackage.aooc.af(objF);
                if (((java.lang.Boolean) objF).booleanValue()) {
                    jbeVar.c = 2;
                    objF = b(jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    jbnVarB = jbn.b(((defpackage.jbr) objF).c);
                    if (jbnVarB == null) {
                        jbnVarB = jbn.e;
                    }
                    if (jbnVarB != jbn.d) {
                        ecxVar = this.j;
                        bpjVar = new defpackage.bpj(jbnVarB, (defpackage.aoln) null, 11);
                        jbeVar.c = 3;
                        if (ecxVar.a(bpjVar, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    jbnVar = jbn.d;
                    jbeVar.c = 4;
                    if (l(jbnVar, jbeVar) == aoluVar) {
                        return aoluVar;
                    }
                    return java.lang.Boolean.FALSE;
                }
                jbeVar.c = 5;
                objF = b(jbeVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                jbnVarB2 = jbn.b(((defpackage.jbr) objF).c);
                if (jbnVarB2 == null) {
                    jbnVarB2 = jbn.e;
                }
                if (jbnVarB2 == jbn.d) {
                    jbeVar.c = 6;
                    objF = b(jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    jbnVarB3 = jbn.b(((defpackage.jbr) objF).i);
                    if (jbnVarB3 == null) {
                        jbnVarB3 = jbn.e;
                    }
                    jbeVar.c = 7;
                    if (l(jbnVarB3, jbeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                jbeVar.c = 8;
                objF = b(jbeVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                jbnVarB4 = jbn.b(((defpackage.jbr) objF).c);
                if (jbnVarB4 == null) {
                    jbnVarB4 = jbn.e;
                }
                iOrdinal = jbnVarB4.ordinal();
                if (iOrdinal != 0) {
                    if (((java.lang.Boolean) this.p.a()).booleanValue()) {
                        jbeVar.c = 9;
                        objF = h(jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) objF).booleanValue()) {
                            ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 106, "BeeslySettings.kt")).v("SIM is not ready yet, deferring enrollment check");
                            return java.lang.Boolean.FALSE;
                        }
                    }
                    jbeVar.c = 10;
                    objF = e(1839, jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objF).booleanValue()) {
                        jbnVar2 = jbn.c;
                        jbeVar.c = 11;
                        if (l(jbnVar2, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        if (((java.lang.Boolean) this.q.a()).booleanValue()) {
                            jbeVar.c = 12;
                            objF = e(1449, jbeVar);
                            if (objF == aoluVar) {
                                return aoluVar;
                            }
                            if (!((java.lang.Boolean) objF).booleanValue()) {
                                ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 115, "BeeslySettings.kt")).v("Beesly is opted out for O2 CZ SIM");
                                jbnVar3 = jbn.c;
                                jbeVar.c = 13;
                                if (l(jbnVar3, jbeVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                        jbeVar.c = 14;
                        objF = i(jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                        aimzVar = g;
                        if (zBooleanValue) {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 120, "BeeslySettings.kt")).v("Beesly is opted out as VVM is enabled");
                            jbnVar5 = jbn.c;
                            jbeVar.c = 15;
                            if (l(jbnVar5, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 125, "BeeslySettings.kt")).v("Beesly is auto enrolled as VVM is disabled");
                            jbnVar4 = jbn.b;
                            jbeVar.c = 16;
                            if (l(jbnVar4, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    z = false;
                } else if (iOrdinal != 1) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 2:
                defpackage.aooc.af(objF);
                jbnVarB = jbn.b(((defpackage.jbr) objF).c);
                if (jbnVarB == null) {
                    jbnVarB = jbn.e;
                }
                if (jbnVarB != jbn.d) {
                    ecxVar = this.j;
                    bpjVar = new defpackage.bpj(jbnVarB, (defpackage.aoln) null, 11);
                    jbeVar.c = 3;
                    if (ecxVar.a(bpjVar, jbeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                jbnVar = jbn.d;
                jbeVar.c = 4;
                if (l(jbnVar, jbeVar) == aoluVar) {
                    return aoluVar;
                }
                return java.lang.Boolean.FALSE;
            case 3:
                defpackage.aooc.af(objF);
                jbnVar = jbn.d;
                jbeVar.c = 4;
                if (l(jbnVar, jbeVar) == aoluVar) {
                    return aoluVar;
                }
                return java.lang.Boolean.FALSE;
            case 4:
                defpackage.aooc.af(objF);
                return java.lang.Boolean.FALSE;
            case 5:
                defpackage.aooc.af(objF);
                jbnVarB2 = jbn.b(((defpackage.jbr) objF).c);
                if (jbnVarB2 == null) {
                    jbnVarB2 = jbn.e;
                }
                if (jbnVarB2 == jbn.d) {
                    jbeVar.c = 6;
                    objF = b(jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    jbnVarB3 = jbn.b(((defpackage.jbr) objF).i);
                    if (jbnVarB3 == null) {
                        jbnVarB3 = jbn.e;
                    }
                    jbeVar.c = 7;
                    if (l(jbnVarB3, jbeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                jbeVar.c = 8;
                objF = b(jbeVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                jbnVarB4 = jbn.b(((defpackage.jbr) objF).c);
                if (jbnVarB4 == null) {
                    jbnVarB4 = jbn.e;
                }
                iOrdinal = jbnVarB4.ordinal();
                if (iOrdinal != 0) {
                    if (((java.lang.Boolean) this.p.a()).booleanValue()) {
                        jbeVar.c = 9;
                        objF = h(jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) objF).booleanValue()) {
                            ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 106, "BeeslySettings.kt")).v("SIM is not ready yet, deferring enrollment check");
                            return java.lang.Boolean.FALSE;
                        }
                    }
                    jbeVar.c = 10;
                    objF = e(1839, jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objF).booleanValue()) {
                        jbnVar2 = jbn.c;
                        jbeVar.c = 11;
                        if (l(jbnVar2, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        if (((java.lang.Boolean) this.q.a()).booleanValue()) {
                            jbeVar.c = 12;
                            objF = e(1449, jbeVar);
                            if (objF == aoluVar) {
                                return aoluVar;
                            }
                            if (!((java.lang.Boolean) objF).booleanValue()) {
                                ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 115, "BeeslySettings.kt")).v("Beesly is opted out for O2 CZ SIM");
                                jbnVar3 = jbn.c;
                                jbeVar.c = 13;
                                if (l(jbnVar3, jbeVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                        jbeVar.c = 14;
                        objF = i(jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                        aimzVar = g;
                        if (zBooleanValue) {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 120, "BeeslySettings.kt")).v("Beesly is opted out as VVM is enabled");
                            jbnVar5 = jbn.c;
                            jbeVar.c = 15;
                            if (l(jbnVar5, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 125, "BeeslySettings.kt")).v("Beesly is auto enrolled as VVM is disabled");
                            jbnVar4 = jbn.b;
                            jbeVar.c = 16;
                            if (l(jbnVar4, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    z = false;
                } else if (iOrdinal != 1) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eft.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.aooc.af(objF);
                jbnVarB3 = jbn.b(((defpackage.jbr) objF).i);
                if (jbnVarB3 == null) {
                    jbnVarB3 = jbn.e;
                }
                jbeVar.c = 7;
                if (l(jbnVarB3, jbeVar) == aoluVar) {
                    return aoluVar;
                }
                jbeVar.c = 8;
                objF = b(jbeVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                jbnVarB4 = jbn.b(((defpackage.jbr) objF).c);
                if (jbnVarB4 == null) {
                    jbnVarB4 = jbn.e;
                }
                iOrdinal = jbnVarB4.ordinal();
                if (iOrdinal != 0) {
                    if (((java.lang.Boolean) this.p.a()).booleanValue()) {
                        jbeVar.c = 9;
                        objF = h(jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) objF).booleanValue()) {
                            ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 106, "BeeslySettings.kt")).v("SIM is not ready yet, deferring enrollment check");
                            return java.lang.Boolean.FALSE;
                        }
                    }
                    jbeVar.c = 10;
                    objF = e(1839, jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objF).booleanValue()) {
                        jbnVar2 = jbn.c;
                        jbeVar.c = 11;
                        if (l(jbnVar2, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        if (((java.lang.Boolean) this.q.a()).booleanValue()) {
                            jbeVar.c = 12;
                            objF = e(1449, jbeVar);
                            if (objF == aoluVar) {
                                return aoluVar;
                            }
                            if (!((java.lang.Boolean) objF).booleanValue()) {
                                ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 115, "BeeslySettings.kt")).v("Beesly is opted out for O2 CZ SIM");
                                jbnVar3 = jbn.c;
                                jbeVar.c = 13;
                                if (l(jbnVar3, jbeVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                        jbeVar.c = 14;
                        objF = i(jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                        aimzVar = g;
                        if (zBooleanValue) {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 120, "BeeslySettings.kt")).v("Beesly is opted out as VVM is enabled");
                            jbnVar5 = jbn.c;
                            jbeVar.c = 15;
                            if (l(jbnVar5, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 125, "BeeslySettings.kt")).v("Beesly is auto enrolled as VVM is disabled");
                            jbnVar4 = jbn.b;
                            jbeVar.c = 16;
                            if (l(jbnVar4, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    z = false;
                } else if (iOrdinal != 1) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eft.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.aooc.af(objF);
                jbeVar.c = 8;
                objF = b(jbeVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                jbnVarB4 = jbn.b(((defpackage.jbr) objF).c);
                if (jbnVarB4 == null) {
                    jbnVarB4 = jbn.e;
                }
                iOrdinal = jbnVarB4.ordinal();
                if (iOrdinal != 0) {
                    if (((java.lang.Boolean) this.p.a()).booleanValue()) {
                        jbeVar.c = 9;
                        objF = h(jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) objF).booleanValue()) {
                            ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 106, "BeeslySettings.kt")).v("SIM is not ready yet, deferring enrollment check");
                            return java.lang.Boolean.FALSE;
                        }
                    }
                    jbeVar.c = 10;
                    objF = e(1839, jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objF).booleanValue()) {
                        jbnVar2 = jbn.c;
                        jbeVar.c = 11;
                        if (l(jbnVar2, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        if (((java.lang.Boolean) this.q.a()).booleanValue()) {
                            jbeVar.c = 12;
                            objF = e(1449, jbeVar);
                            if (objF == aoluVar) {
                                return aoluVar;
                            }
                            if (!((java.lang.Boolean) objF).booleanValue()) {
                                ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 115, "BeeslySettings.kt")).v("Beesly is opted out for O2 CZ SIM");
                                jbnVar3 = jbn.c;
                                jbeVar.c = 13;
                                if (l(jbnVar3, jbeVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                        jbeVar.c = 14;
                        objF = i(jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                        aimzVar = g;
                        if (zBooleanValue) {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 120, "BeeslySettings.kt")).v("Beesly is opted out as VVM is enabled");
                            jbnVar5 = jbn.c;
                            jbeVar.c = 15;
                            if (l(jbnVar5, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 125, "BeeslySettings.kt")).v("Beesly is auto enrolled as VVM is disabled");
                            jbnVar4 = jbn.b;
                            jbeVar.c = 16;
                            if (l(jbnVar4, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    z = false;
                } else if (iOrdinal != 1) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case defpackage.eft.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.aooc.af(objF);
                jbnVarB4 = jbn.b(((defpackage.jbr) objF).c);
                if (jbnVarB4 == null) {
                    jbnVarB4 = jbn.e;
                }
                iOrdinal = jbnVarB4.ordinal();
                if (iOrdinal != 0) {
                    if (((java.lang.Boolean) this.p.a()).booleanValue()) {
                        jbeVar.c = 9;
                        objF = h(jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) objF).booleanValue()) {
                            ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 106, "BeeslySettings.kt")).v("SIM is not ready yet, deferring enrollment check");
                            return java.lang.Boolean.FALSE;
                        }
                    }
                    jbeVar.c = 10;
                    objF = e(1839, jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    if (((java.lang.Boolean) objF).booleanValue()) {
                        jbnVar2 = jbn.c;
                        jbeVar.c = 11;
                        if (l(jbnVar2, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        if (((java.lang.Boolean) this.q.a()).booleanValue()) {
                            jbeVar.c = 12;
                            objF = e(1449, jbeVar);
                            if (objF == aoluVar) {
                                return aoluVar;
                            }
                            if (!((java.lang.Boolean) objF).booleanValue()) {
                                ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 115, "BeeslySettings.kt")).v("Beesly is opted out for O2 CZ SIM");
                                jbnVar3 = jbn.c;
                                jbeVar.c = 13;
                                if (l(jbnVar3, jbeVar) == aoluVar) {
                                    return aoluVar;
                                }
                            }
                        }
                        jbeVar.c = 14;
                        objF = i(jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                        aimzVar = g;
                        if (zBooleanValue) {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 120, "BeeslySettings.kt")).v("Beesly is opted out as VVM is enabled");
                            jbnVar5 = jbn.c;
                            jbeVar.c = 15;
                            if (l(jbnVar5, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        } else {
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 125, "BeeslySettings.kt")).v("Beesly is auto enrolled as VVM is disabled");
                            jbnVar4 = jbn.b;
                            jbeVar.c = 16;
                            if (l(jbnVar4, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    z = false;
                } else if (iOrdinal != 1) {
                    z = false;
                }
                return java.lang.Boolean.valueOf(z);
            case 9:
                defpackage.aooc.af(objF);
                if (!((java.lang.Boolean) objF).booleanValue()) {
                    ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 106, "BeeslySettings.kt")).v("SIM is not ready yet, deferring enrollment check");
                    return java.lang.Boolean.FALSE;
                }
                jbeVar.c = 10;
                objF = e(1839, jbeVar);
                if (objF == aoluVar) {
                    return aoluVar;
                }
                if (((java.lang.Boolean) objF).booleanValue()) {
                    if (((java.lang.Boolean) this.q.a()).booleanValue()) {
                        jbeVar.c = 12;
                        objF = e(1449, jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) objF).booleanValue()) {
                            ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 115, "BeeslySettings.kt")).v("Beesly is opted out for O2 CZ SIM");
                            jbnVar3 = jbn.c;
                            jbeVar.c = 13;
                            if (l(jbnVar3, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    jbeVar.c = 14;
                    objF = i(jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                    aimzVar = g;
                    if (zBooleanValue) {
                        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 120, "BeeslySettings.kt")).v("Beesly is opted out as VVM is enabled");
                        jbnVar5 = jbn.c;
                        jbeVar.c = 15;
                        if (l(jbnVar5, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 125, "BeeslySettings.kt")).v("Beesly is auto enrolled as VVM is disabled");
                        jbnVar4 = jbn.b;
                        jbeVar.c = 16;
                        if (l(jbnVar4, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                }
                jbnVar2 = jbn.c;
                jbeVar.c = 11;
                if (l(jbnVar2, jbeVar) == aoluVar) {
                    return aoluVar;
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            case 10:
                defpackage.aooc.af(objF);
                if (((java.lang.Boolean) objF).booleanValue()) {
                    if (((java.lang.Boolean) this.q.a()).booleanValue()) {
                        jbeVar.c = 12;
                        objF = e(1449, jbeVar);
                        if (objF == aoluVar) {
                            return aoluVar;
                        }
                        if (!((java.lang.Boolean) objF).booleanValue()) {
                            ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 115, "BeeslySettings.kt")).v("Beesly is opted out for O2 CZ SIM");
                            jbnVar3 = jbn.c;
                            jbeVar.c = 13;
                            if (l(jbnVar3, jbeVar) == aoluVar) {
                                return aoluVar;
                            }
                        }
                    }
                    jbeVar.c = 14;
                    objF = i(jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                    aimzVar = g;
                    if (zBooleanValue) {
                        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 120, "BeeslySettings.kt")).v("Beesly is opted out as VVM is enabled");
                        jbnVar5 = jbn.c;
                        jbeVar.c = 15;
                        if (l(jbnVar5, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 125, "BeeslySettings.kt")).v("Beesly is auto enrolled as VVM is disabled");
                        jbnVar4 = jbn.b;
                        jbeVar.c = 16;
                        if (l(jbnVar4, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                }
                jbnVar2 = jbn.c;
                jbeVar.c = 11;
                if (l(jbnVar2, jbeVar) == aoluVar) {
                    return aoluVar;
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            case 11:
            case 13:
            case 15:
                defpackage.aooc.af(objF);
                z = false;
                return java.lang.Boolean.valueOf(z);
            case 12:
                defpackage.aooc.af(objF);
                if (!((java.lang.Boolean) objF).booleanValue()) {
                    jbeVar.c = 14;
                    objF = i(jbeVar);
                    if (objF == aoluVar) {
                        return aoluVar;
                    }
                    zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                    aimzVar = g;
                    if (zBooleanValue) {
                        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 120, "BeeslySettings.kt")).v("Beesly is opted out as VVM is enabled");
                        jbnVar5 = jbn.c;
                        jbeVar.c = 15;
                        if (l(jbnVar5, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    } else {
                        ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 125, "BeeslySettings.kt")).v("Beesly is auto enrolled as VVM is disabled");
                        jbnVar4 = jbn.b;
                        jbeVar.c = 16;
                        if (l(jbnVar4, jbeVar) == aoluVar) {
                            return aoluVar;
                        }
                    }
                    return java.lang.Boolean.valueOf(z);
                }
                ((defpackage.aimw) g.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 115, "BeeslySettings.kt")).v("Beesly is opted out for O2 CZ SIM");
                jbnVar3 = jbn.c;
                jbeVar.c = 13;
                if (l(jbnVar3, jbeVar) == aoluVar) {
                    return aoluVar;
                }
                z = false;
                return java.lang.Boolean.valueOf(z);
            case 14:
                defpackage.aooc.af(objF);
                zBooleanValue = ((java.lang.Boolean) objF).booleanValue();
                aimzVar = g;
                if (zBooleanValue) {
                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 120, "BeeslySettings.kt")).v("Beesly is opted out as VVM is enabled");
                    jbnVar5 = jbn.c;
                    jbeVar.c = 15;
                    if (l(jbnVar5, jbeVar) == aoluVar) {
                        return aoluVar;
                    }
                    z = false;
                } else {
                    ((defpackage.aimw) aimzVar.b().l("com/android/dialer/beesly/impl/settings/service/BeeslySettings", "isEnrolled", 125, "BeeslySettings.kt")).v("Beesly is auto enrolled as VVM is disabled");
                    jbnVar4 = jbn.b;
                    jbeVar.c = 16;
                    if (l(jbnVar4, jbeVar) == aoluVar) {
                        return aoluVar;
                    }
                }
                return java.lang.Boolean.valueOf(z);
            case 16:
                defpackage.aooc.af(objF);
                return java.lang.Boolean.valueOf(z);
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(defpackage.aoln aolnVar) {
        jbf jbfVar;
        if (aolnVar instanceof jbf) {
            jbfVar = (jbf) aolnVar;
            int i = jbfVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbfVar.c = i - Integer.MIN_VALUE;
            } else {
                jbfVar = new jbf(this, aolnVar);
            }
        } else {
            jbfVar = new jbf(this, aolnVar);
        }
        java.lang.Object objAj = jbfVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jbfVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(objAj);
            defpackage.oko okoVar = this.n;
            jbfVar.c = 1;
            objAj = defpackage.aoov.aj(okoVar.e, new defpackage.okl(okoVar, (defpackage.aoln) null, 8, (char[][]) null), jbfVar);
            if (objAj == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(objAj);
        }
        return java.lang.Boolean.valueOf(((java.lang.Number) objAj).intValue() == 5);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Object, vcc] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a8 -> B:36:0x00cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c2 -> B:33:0x00c4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(defpackage.aoln r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jbm.i(aoln):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object j(defpackage.aoln aolnVar) {
        jbh jbhVar;
        if (aolnVar instanceof jbh) {
            jbhVar = (jbh) aolnVar;
            int i = jbhVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbhVar.c = i - Integer.MIN_VALUE;
            } else {
                jbhVar = new jbh(this, aolnVar);
            }
        } else {
            jbhVar = new jbh(this, aolnVar);
        }
        java.lang.Object obj = jbhVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jbhVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            if (!((java.lang.Boolean) this.l.a()).booleanValue()) {
                defpackage.ecx ecxVar = this.j;
                defpackage.ipv ipvVar = new defpackage.ipv((defpackage.aoln) null, 12, (float[][]) null);
                jbhVar.c = 1;
                if (ecxVar.a(ipvVar, jbhVar) == aoluVar) {
                    return aoluVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object k(defpackage.jbp jbpVar, defpackage.aoln aolnVar) {
        jbi jbiVar;
        if (aolnVar instanceof jbi) {
            jbiVar = (jbi) aolnVar;
            int i = jbiVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbiVar.c = i - Integer.MIN_VALUE;
            } else {
                jbiVar = new jbi(this, aolnVar);
            }
        } else {
            jbiVar = new jbi(this, aolnVar);
        }
        java.lang.Object obj = jbiVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jbiVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.j;
            defpackage.bpj bpjVar = new defpackage.bpj(jbpVar, (defpackage.aoln) null, 12);
            jbiVar.c = 1;
            if (ecxVar.a(bpjVar, jbiVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object l(jbn jbnVar, defpackage.aoln aolnVar) {
        jbj jbjVar;
        if (aolnVar instanceof jbj) {
            jbjVar = (jbj) aolnVar;
            int i = jbjVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbjVar.c = i - Integer.MIN_VALUE;
            } else {
                jbjVar = new jbj(this, aolnVar);
            }
        } else {
            jbjVar = new jbj(this, aolnVar);
        }
        java.lang.Object obj = jbjVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jbjVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                defpackage.aooc.af(obj);
            } else {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                defpackage.aooc.af(obj);
            }
            return defpackage.aojh.a;
        }
        defpackage.aooc.af(obj);
        defpackage.ecx ecxVar = this.j;
        defpackage.bpj bpjVar = new defpackage.bpj(jbnVar, (defpackage.aoln) null, 13, (byte[]) null);
        jbjVar.c = 1;
        if (ecxVar.a(bpjVar, jbjVar) == aoluVar) {
            return aoluVar;
        }
        j$.util.Optional optionalG = this.s.g();
        defpackage.aooh.e(optionalG, "getFeature(...)");
        defpackage.jin jinVar = (defpackage.jin) defpackage.aooh.q(optionalG);
        if (jinVar != null) {
            jbjVar.c = 2;
            if (jinVar.e() == aoluVar) {
                return aoluVar;
            }
        }
        return defpackage.aojh.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object m(boolean z, defpackage.aoln aolnVar) {
        jbk jbkVar;
        if (aolnVar instanceof jbk) {
            jbkVar = (jbk) aolnVar;
            int i = jbkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbkVar.c = i - Integer.MIN_VALUE;
            } else {
                jbkVar = new jbk(this, aolnVar);
            }
        } else {
            jbkVar = new jbk(this, aolnVar);
        }
        java.lang.Object obj = jbkVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = jbkVar.c;
        if (i2 == 0) {
            defpackage.aooc.af(obj);
            defpackage.ecx ecxVar = this.j;
            jbl jblVar = new jbl(z, (defpackage.aoln) null, 0);
            jbkVar.c = 1;
            if (ecxVar.a(jblVar, jbkVar) == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.aooc.af(obj);
        }
        return defpackage.aojh.a;
    }
}
