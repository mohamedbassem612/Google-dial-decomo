package j$.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class p extends j$.util.concurrent.k {
    public static final j$.sun.misc.a h;
    public static final long i;
    public j$.util.concurrent.q e;
    public volatile j$.util.concurrent.q f;
    public volatile java.lang.Thread g;
    volatile int lockState;

    static {
        j$.sun.misc.a aVar = j$.sun.misc.a.b;
        h = aVar;
        i = aVar.a(j$.util.concurrent.p.class, "lockState");
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a A[PHI: r7
      0x004a: PHI (r7v3 java.lang.Class<?>) = (r7v2 java.lang.Class<?>), (r7v4 java.lang.Class<?>) binds: [B:23:0x0048, B:16:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    public p(j$.util.concurrent.q qVar) {
        int i2;
        super(-2, null, null);
        this.f = qVar;
        j$.util.concurrent.q qVar2 = null;
        while (qVar != null) {
            j$.util.concurrent.q qVar3 = (j$.util.concurrent.q) qVar.d;
            qVar.g = null;
            qVar.f = null;
            if (qVar2 == null) {
                qVar.e = null;
                qVar.i = false;
            } else {
                java.lang.Object obj = qVar.b;
                int i3 = qVar.a;
                j$.util.concurrent.q qVar4 = qVar2;
                java.lang.Class<?> clsC = null;
                while (true) {
                    java.lang.Object obj2 = qVar4.b;
                    int i4 = qVar4.a;
                    if (i4 > i3) {
                        i2 = -1;
                    } else if (i4 < i3) {
                        i2 = 1;
                    } else if (clsC == null && (clsC = j$.util.concurrent.ConcurrentHashMap.c(obj)) == null) {
                        i2 = i(obj, obj2);
                    } else {
                        int i5 = j$.util.concurrent.ConcurrentHashMap.g;
                        int iCompareTo = (obj2 == null || obj2.getClass() != clsC) ? 0 : ((java.lang.Comparable) obj).compareTo(obj2);
                        if (iCompareTo == 0) {
                            i2 = i(obj, obj2);
                        } else {
                            i2 = iCompareTo;
                        }
                    }
                    j$.util.concurrent.q qVar5 = i2 <= 0 ? qVar4.f : qVar4.g;
                    if (qVar5 == null) {
                        break;
                    } else {
                        qVar4 = qVar5;
                    }
                }
                qVar.e = qVar4;
                if (i2 <= 0) {
                    qVar4.f = qVar;
                } else {
                    qVar4.g = qVar;
                }
                qVar = c(qVar2, qVar);
            }
            qVar2 = qVar;
            qVar = qVar3;
        }
        this.e = qVar2;
    }

    public static j$.util.concurrent.q b(j$.util.concurrent.q qVar, j$.util.concurrent.q qVar2) {
        while (qVar2 != null && qVar2 != qVar) {
            j$.util.concurrent.q qVar3 = qVar2.e;
            if (qVar3 == null) {
                qVar2.i = false;
                return qVar2;
            }
            if (qVar2.i) {
                qVar2.i = false;
                return qVar;
            }
            j$.util.concurrent.q qVar4 = qVar3.f;
            if (qVar4 == qVar2) {
                j$.util.concurrent.q qVar5 = qVar3.g;
                if (qVar5 != null && qVar5.i) {
                    qVar5.i = false;
                    qVar3.i = true;
                    qVar = g(qVar, qVar3);
                    qVar3 = qVar2.e;
                    qVar5 = qVar3 == null ? null : qVar3.g;
                }
                if (qVar5 != null) {
                    j$.util.concurrent.q qVar6 = qVar5.f;
                    j$.util.concurrent.q qVar7 = qVar5.g;
                    if ((qVar7 == null || !qVar7.i) && (qVar6 == null || !qVar6.i)) {
                        qVar5.i = true;
                    } else {
                        if (qVar7 == null || !qVar7.i) {
                            if (qVar6 != null) {
                                qVar6.i = false;
                            }
                            qVar5.i = true;
                            qVar = h(qVar, qVar5);
                            qVar3 = qVar2.e;
                            qVar5 = qVar3 != null ? qVar3.g : null;
                        }
                        if (qVar5 != null) {
                            qVar5.i = qVar3 == null ? false : qVar3.i;
                            j$.util.concurrent.q qVar8 = qVar5.g;
                            if (qVar8 != null) {
                                qVar8.i = false;
                            }
                        }
                        if (qVar3 != null) {
                            qVar3.i = false;
                            qVar = g(qVar, qVar3);
                        }
                        qVar2 = qVar;
                    }
                }
                qVar2 = qVar3;
            } else {
                if (qVar4 != null && qVar4.i) {
                    qVar4.i = false;
                    qVar3.i = true;
                    qVar = h(qVar, qVar3);
                    qVar3 = qVar2.e;
                    qVar4 = qVar3 == null ? null : qVar3.f;
                }
                if (qVar4 != null) {
                    j$.util.concurrent.q qVar9 = qVar4.f;
                    j$.util.concurrent.q qVar10 = qVar4.g;
                    if ((qVar9 == null || !qVar9.i) && (qVar10 == null || !qVar10.i)) {
                        qVar4.i = true;
                    } else {
                        if (qVar9 == null || !qVar9.i) {
                            if (qVar10 != null) {
                                qVar10.i = false;
                            }
                            qVar4.i = true;
                            qVar = g(qVar, qVar4);
                            qVar3 = qVar2.e;
                            qVar4 = qVar3 != null ? qVar3.f : null;
                        }
                        if (qVar4 != null) {
                            qVar4.i = qVar3 == null ? false : qVar3.i;
                            j$.util.concurrent.q qVar11 = qVar4.f;
                            if (qVar11 != null) {
                                qVar11.i = false;
                            }
                        }
                        if (qVar3 != null) {
                            qVar3.i = false;
                            qVar = h(qVar, qVar3);
                        }
                        qVar2 = qVar;
                    }
                }
                qVar2 = qVar3;
            }
        }
        return qVar;
    }

    public static j$.util.concurrent.q c(j$.util.concurrent.q qVar, j$.util.concurrent.q qVar2) {
        j$.util.concurrent.q qVar3;
        qVar2.i = true;
        while (true) {
            j$.util.concurrent.q qVar4 = qVar2.e;
            if (qVar4 == null) {
                qVar2.i = false;
                return qVar2;
            }
            if (!qVar4.i || (qVar3 = qVar4.e) == null) {
                return qVar;
            }
            j$.util.concurrent.q qVar5 = qVar3.f;
            if (qVar4 == qVar5) {
                j$.util.concurrent.q qVar6 = qVar3.g;
                if (qVar6 == null || !qVar6.i) {
                    if (qVar2 == qVar4.g) {
                        qVar = g(qVar, qVar4);
                        j$.util.concurrent.q qVar7 = qVar4.e;
                        qVar3 = qVar7 == null ? null : qVar7.e;
                        qVar4 = qVar7;
                        qVar2 = qVar4;
                    }
                    if (qVar4 != null) {
                        qVar4.i = false;
                        if (qVar3 != null) {
                            qVar3.i = true;
                            qVar = h(qVar, qVar3);
                        }
                    }
                } else {
                    qVar6.i = false;
                    qVar4.i = false;
                    qVar3.i = true;
                    qVar2 = qVar3;
                }
            } else if (qVar5 == null || !qVar5.i) {
                if (qVar2 == qVar4.f) {
                    qVar = h(qVar, qVar4);
                    j$.util.concurrent.q qVar8 = qVar4.e;
                    qVar3 = qVar8 == null ? null : qVar8.e;
                    qVar4 = qVar8;
                    qVar2 = qVar4;
                }
                if (qVar4 != null) {
                    qVar4.i = false;
                    if (qVar3 != null) {
                        qVar3.i = true;
                        qVar = g(qVar, qVar3);
                    }
                }
            } else {
                qVar5.i = false;
                qVar4.i = false;
                qVar3.i = true;
                qVar2 = qVar3;
            }
        }
    }

    public static j$.util.concurrent.q g(j$.util.concurrent.q qVar, j$.util.concurrent.q qVar2) {
        j$.util.concurrent.q qVar3;
        if (qVar2 != null && (qVar3 = qVar2.g) != null) {
            j$.util.concurrent.q qVar4 = qVar3.f;
            qVar2.g = qVar4;
            if (qVar4 != null) {
                qVar4.e = qVar2;
            }
            j$.util.concurrent.q qVar5 = qVar2.e;
            qVar3.e = qVar5;
            if (qVar5 == null) {
                qVar3.i = false;
                qVar = qVar3;
            } else if (qVar5.f == qVar2) {
                qVar5.f = qVar3;
            } else {
                qVar5.g = qVar3;
            }
            qVar3.f = qVar2;
            qVar2.e = qVar3;
        }
        return qVar;
    }

    public static j$.util.concurrent.q h(j$.util.concurrent.q qVar, j$.util.concurrent.q qVar2) {
        j$.util.concurrent.q qVar3;
        if (qVar2 != null && (qVar3 = qVar2.f) != null) {
            j$.util.concurrent.q qVar4 = qVar3.g;
            qVar2.f = qVar4;
            if (qVar4 != null) {
                qVar4.e = qVar2;
            }
            j$.util.concurrent.q qVar5 = qVar2.e;
            qVar3.e = qVar5;
            if (qVar5 == null) {
                qVar3.i = false;
                qVar = qVar3;
            } else if (qVar5.g == qVar2) {
                qVar5.g = qVar3;
            } else {
                qVar5.f = qVar3;
            }
            qVar3.g = qVar2;
            qVar2.e = qVar3;
        }
        return qVar;
    }

    public static int i(java.lang.Object obj, java.lang.Object obj2) {
        int iCompareTo;
        if (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return java.lang.System.identityHashCode(obj) <= java.lang.System.identityHashCode(obj2) ? -1 : 1;
        }
        return iCompareTo;
    }

    @Override // j$.util.concurrent.k
    public final j$.util.concurrent.k a(int i2, java.lang.Object obj) {
        int intVolatile;
        java.lang.Thread thread;
        int intVolatile2;
        java.lang.Thread thread2;
        j$.util.concurrent.k kVar = this.f;
        while (true) {
            j$.util.concurrent.k kVar2 = kVar;
            while (kVar2 != null) {
                int i3 = this.lockState;
                if ((i3 & 3) != 0) {
                    if (kVar2.a == i2) {
                        java.lang.Object obj2 = kVar2.b;
                        if (obj2 == obj) {
                            return kVar2;
                        }
                        if (obj2 != null && obj.equals(obj2)) {
                            return kVar2;
                        }
                    }
                    kVar = kVar2.d;
                } else {
                    j$.sun.misc.a aVar = h;
                    long j = i;
                    if (aVar.a.compareAndSwapInt(this, j, i3, i3 + 4)) {
                        try {
                            j$.util.concurrent.q qVar = this.e;
                            j$.util.concurrent.q qVarB = qVar == null ? null : qVar.b(i2, obj, null);
                            do {
                                intVolatile2 = aVar.a.getIntVolatile(this, j);
                            } while (!aVar.a.compareAndSwapInt(this, j, intVolatile2, intVolatile2 - 4));
                            if (intVolatile2 != 6 || (thread2 = this.g) == null) {
                                return qVarB;
                            }
                            java.util.concurrent.locks.LockSupport.unpark(thread2);
                            return qVarB;
                        } catch (java.lang.Throwable th) {
                            j$.sun.misc.a aVar2 = h;
                            long j2 = i;
                            do {
                                intVolatile = aVar2.a.getIntVolatile(this, j2);
                            } while (!aVar2.a.compareAndSwapInt(this, j2, intVolatile, intVolatile - 4));
                            if (intVolatile != 6 || (thread = this.g) == null) {
                                throw th;
                            }
                            java.util.concurrent.locks.LockSupport.unpark(thread);
                            throw th;
                        }
                    }
                }
            }
            return null;
        }
    }

    public final void d() {
        j$.sun.misc.a aVar = h;
        if (aVar.a.compareAndSwapInt(this, i, 0, 1)) {
            return;
        }
        boolean z = false;
        while (true) {
            int i2 = this.lockState;
            if ((i2 & (-3)) == 0) {
                j$.sun.misc.a aVar2 = h;
                if (aVar2.a.compareAndSwapInt(this, i, i2, 1)) {
                    break;
                }
            } else if ((i2 & 2) == 0) {
                if (h.a.compareAndSwapInt(this, i, i2, i2 | 2)) {
                    this.g = java.lang.Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                java.util.concurrent.locks.LockSupport.park(this);
            }
        }
        if (z) {
            this.g = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003b A[PHI: r0
      0x003b: PHI (r0v3 java.lang.Class<?>) = (r0v2 java.lang.Class<?>), (r0v5 java.lang.Class<?>) binds: [B:16:0x0032, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0050 A[PHI: r0
      0x0050: PHI (r0v4 java.lang.Class<?>) = (r0v3 java.lang.Class<?>), (r0v5 java.lang.Class<?>) binds: [B:25:0x004e, B:18:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    public final j$.util.concurrent.q e(int i2, java.lang.Object obj, java.lang.Object obj2) {
        int iCompareTo;
        int i3;
        j$.util.concurrent.q qVar;
        j$.util.concurrent.q qVar2;
        j$.util.concurrent.q qVarB;
        j$.util.concurrent.q qVar3 = this.e;
        java.lang.Class<?> cls = null;
        boolean z = false;
        while (qVar3 != null) {
            int i4 = i2;
            java.lang.Object obj3 = obj;
            java.lang.Object obj4 = obj2;
            int i5 = qVar3.a;
            if (i5 > i4) {
                i3 = -1;
            } else if (i5 < i4) {
                i3 = 1;
            } else {
                java.lang.Object obj5 = qVar3.b;
                if (obj5 == obj3 || (obj5 != null && obj3.equals(obj5))) {
                    return qVar3;
                }
                if (cls == null) {
                    java.lang.Class<?> clsC = j$.util.concurrent.ConcurrentHashMap.c(obj3);
                    cls = clsC;
                    if (clsC != null) {
                        int i6 = j$.util.concurrent.ConcurrentHashMap.g;
                        if (obj5 == null && obj5.getClass() == cls) {
                            iCompareTo = ((java.lang.Comparable) obj3).compareTo(obj5);
                        } else {
                            iCompareTo = 0;
                        }
                        if (iCompareTo == 0) {
                            if (!z) {
                                qVar = qVar3.f;
                                if ((qVar == null && (qVarB = qVar.b(i4, obj3, cls)) != null) || ((qVar2 = qVar3.g) != null && (qVarB = qVar2.b(i4, obj3, cls)) != null)) {
                                    return qVarB;
                                }
                            }
                            i3 = i(obj3, obj5);
                        } else {
                            i3 = iCompareTo;
                        }
                    } else {
                        if (!z) {
                            qVar = qVar3.f;
                            z = qVar == null ? true : true;
                            return qVarB;
                        }
                        i3 = i(obj3, obj5);
                    }
                } else {
                    int i7 = j$.util.concurrent.ConcurrentHashMap.g;
                    if (obj5 == null) {
                        iCompareTo = 0;
                    } else {
                        iCompareTo = 0;
                    }
                    if (iCompareTo == 0) {
                        if (!z) {
                            qVar = qVar3.f;
                            if (qVar == null) {
                            }
                            return qVarB;
                        }
                        i3 = i(obj3, obj5);
                    } else {
                        i3 = iCompareTo;
                    }
                }
            }
            j$.util.concurrent.q qVar4 = i3 <= 0 ? qVar3.f : qVar3.g;
            if (qVar4 == null) {
                j$.util.concurrent.q qVar5 = this.f;
                j$.util.concurrent.q qVar6 = new j$.util.concurrent.q(i4, obj3, obj4, qVar5, qVar3);
                this.f = qVar6;
                if (qVar5 != null) {
                    qVar5.h = qVar6;
                }
                if (i3 <= 0) {
                    qVar3.f = qVar6;
                } else {
                    qVar3.g = qVar6;
                }
                if (!qVar3.i) {
                    qVar6.i = true;
                    return null;
                }
                d();
                try {
                    this.e = c(this.e, qVar6);
                    return null;
                } finally {
                    this.lockState = 0;
                }
            }
            qVar3 = qVar4;
            i2 = i4;
            obj = obj3;
            obj2 = obj4;
        }
        j$.util.concurrent.q qVar7 = new j$.util.concurrent.q(i2, obj, obj2, null, null);
        this.e = qVar7;
        this.f = qVar7;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0086 A[PHI: r0
      0x0086: PHI (r0v11 j$.util.concurrent.q) = (r0v3 j$.util.concurrent.q), (r0v12 j$.util.concurrent.q) binds: [B:50:0x0082, B:48:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    public final boolean f(j$.util.concurrent.q qVar) {
        j$.util.concurrent.q qVar2;
        j$.util.concurrent.q qVar3;
        j$.util.concurrent.q qVar4 = (j$.util.concurrent.q) qVar.d;
        j$.util.concurrent.q qVar5 = qVar.h;
        if (qVar5 == null) {
            this.f = qVar4;
        } else {
            qVar5.d = qVar4;
        }
        if (qVar4 != null) {
            qVar4.h = qVar5;
        }
        boolean z = true;
        z = true;
        z = true;
        z = true;
        if (this.f == null) {
            this.e = null;
            return true;
        }
        j$.util.concurrent.q qVarB = this.e;
        if (qVarB != null && qVarB.g != null && (qVar2 = qVarB.f) != null && qVar2.f != null) {
            d();
            int i2 = 0;
            z = false;
            try {
                j$.util.concurrent.q qVar6 = qVar.f;
                j$.util.concurrent.q qVar7 = qVar.g;
                if (qVar6 != null) {
                    if (qVar7 != null) {
                        j$.util.concurrent.q qVar8 = qVar7;
                        while (true) {
                            j$.util.concurrent.q qVar9 = qVar8.f;
                            if (qVar9 == null) {
                                break;
                            }
                            qVar8 = qVar9;
                        }
                        boolean z2 = qVar8.i;
                        qVar8.i = qVar.i;
                        qVar.i = z2;
                        j$.util.concurrent.q qVar10 = qVar8.g;
                        j$.util.concurrent.q qVar11 = qVar.e;
                        if (qVar8 == qVar7) {
                            qVar.e = qVar8;
                            qVar8.g = qVar;
                        } else {
                            j$.util.concurrent.q qVar12 = qVar8.e;
                            qVar.e = qVar12;
                            if (qVar12 != null) {
                                if (qVar8 == qVar12.f) {
                                    qVar12.f = qVar;
                                } else {
                                    qVar12.g = qVar;
                                }
                            }
                            qVar8.g = qVar7;
                            qVar7.e = qVar8;
                        }
                        qVar.f = null;
                        qVar.g = qVar10;
                        if (qVar10 != null) {
                            qVar10.e = qVar;
                        }
                        qVar8.f = qVar6;
                        qVar6.e = qVar8;
                        qVar8.e = qVar11;
                        if (qVar11 == null) {
                            qVarB = qVar8;
                        } else if (qVar == qVar11.f) {
                            qVar11.f = qVar8;
                        } else {
                            qVar11.g = qVar8;
                        }
                        if (qVar10 != null) {
                            qVar6 = qVar10;
                        } else {
                            qVar6 = qVar;
                        }
                    }
                } else if (qVar7 != null) {
                    qVar6 = qVar7;
                } else {
                    qVar6 = qVar;
                }
                if (qVar6 != qVar) {
                    j$.util.concurrent.q qVar13 = qVar.e;
                    qVar6.e = qVar13;
                    if (qVar13 == null) {
                        qVarB = qVar6;
                    } else if (qVar == qVar13.f) {
                        qVar13.f = qVar6;
                    } else {
                        qVar13.g = qVar6;
                    }
                    qVar.e = null;
                    qVar.g = null;
                    qVar.f = null;
                }
                if (!qVar.i) {
                    qVarB = b(qVarB, qVar6);
                }
                this.e = qVarB;
                if (qVar == qVar6 && (qVar3 = qVar.e) != null) {
                    if (qVar == qVar3.f) {
                        qVar3.f = null;
                    } else if (qVar == qVar3.g) {
                        qVar3.g = null;
                    }
                    qVar.e = null;
                }
            } finally {
                this.lockState = 0;
            }
        }
        return z;
    }
}
