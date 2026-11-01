package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ulw {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public ulw(zpz zpzVar, aoss aossVar) {
        aooh.f(zpzVar, "inCallUpdatePropagator");
        aooh.f(aossVar, "lightweightScope");
        this.b = zpzVar;
        this.c = aossVar;
        this.a = new j$.util.concurrent.ConcurrentHashMap();
        new ahda((byte[]) null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq a(final long j) {
        final int i = 1;
        return ahvr.H(aiql.v((aify) j$.util.Collection.-EL.stream(((zzx) this.b).k().c()).map(new java.util.function.Function() { // from class: uwq
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                int i2 = i;
                if (i2 != 0) {
                    return i2 != 1 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
                }
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                int i2 = i;
                if (i2 != 0) {
                    return i2 != 1 ? ((defpackage.utx) ((aoin) obj).a()).g(j) : ((defpackage.utx) ((aoin) obj).a()).a(j);
                }
                return ((defpackage.utx) ((aoin) obj).a()).e(j);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                int i2 = i;
                if (i2 != 0) {
                    return i2 != 1 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
                }
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).collect(aido.a)), new defpackage.uev(this, 16), (java.util.concurrent.Executor) this.c);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final ajcq b(final long j, final int i) {
        return ahvr.H(aiql.v((aify) j$.util.Collection.-EL.stream(((zzx) this.b).k().c()).map(new java.util.function.Function() { // from class: uvf
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return ((defpackage.utx) ((aoin) obj).a()).l(j, i);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }).collect(aido.a)), new defpackage.uev(this, 18), (java.util.concurrent.Executor) this.c);
    }

    public final boolean c(java.lang.Class cls, java.lang.Class cls2) {
        return ((java.lang.Class) this.a).isAssignableFrom(cls) && cls2.isAssignableFrom((java.lang.Class) this.c);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final java.util.List d(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.Integer) this.b.get((java.lang.String) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final void e(defpackage.akvy akvyVar) {
        ?? r0 = this.b;
        if (r0.containsKey(akvyVar)) {
            java.lang.Object obj = ((defpackage.akwb) r0.get(akvyVar)).a;
        } else {
            this.c.containsKey(akvyVar);
        }
        ?? r2 = this.c;
        if (r0.containsKey(akvyVar)) {
            if (((defpackage.akwb) r0.get(akvyVar)).a != null) {
                boolean z = ((defpackage.akwb) r0.get(akvyVar)).b;
            }
        } else if (r2.containsKey(akvyVar)) {
            boolean z2 = ((defpackage.akvz) r2.get(akvyVar)).c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.Map] */
    public final void f(defpackage.akvy akvyVar, java.lang.Object obj) {
        int i = akvyVar.bh;
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        boolean zBooleanValue = true;
        if (i2 == 1) {
            zBooleanValue = ((java.lang.Boolean) obj).booleanValue();
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            java.lang.Float f = (java.lang.Float) obj;
                            if (f.isNaN() || f.isInfinite()) {
                                zBooleanValue = false;
                            }
                        }
                    } else if (((java.lang.Long) obj).longValue() < 0) {
                        zBooleanValue = false;
                    }
                } else if (((java.lang.Integer) obj).intValue() < 0) {
                    zBooleanValue = false;
                }
                this.b.put(akvyVar, new defpackage.akwb(obj));
            }
            zBooleanValue = true ^ ((java.lang.String) obj).isEmpty();
        }
        if (!zBooleanValue) {
            this.b.put(akvyVar, new defpackage.akwb(null));
            return;
        }
        this.b.put(akvyVar, new defpackage.akwb(obj));
    }

    public ulw(agab agabVar, ajct ajctVar, zzx zzxVar) {
        this.b = agabVar;
        this.a = ajctVar;
        this.c = zzxVar;
    }

    public ulw(aihd aihdVar, ahyn ahynVar, ahyn ahynVar2) {
        this.c = aihdVar;
        this.b = ahynVar;
        this.a = ahynVar2;
    }

    public ulw(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public ulw(java.util.Map map, java.util.Map map2, defpackage.ajvc ajvcVar) {
        this.b = map;
        this.c = map2;
        this.a = ajvcVar;
    }

    public ulw(java.util.Map map, boolean z, java.lang.String str, java.lang.String str2) {
        this.b = map;
        this.a = new defpackage.alin(z, str, str2);
        this.c = new xtq(map);
    }

    public ulw(defpackage.ult ultVar, defpackage.ulu uluVar, ucm ucmVar) {
        aooh.f(ucmVar, "tikTokAlertDialogs");
        this.a = ultVar;
        this.b = uluVar;
        this.c = ucmVar;
    }

    public ulw(defpackage.ulw ulwVar, byte[] bArr) {
        this.a = ulwVar.a;
        this.c = ulwVar.c;
        this.b = ulwVar.b;
    }

    public ulw(java.lang.String str, j$.time.Instant instant, j$.time.Instant instant2) {
        this.c = str;
        ahvr.ci(instant);
        this.a = instant;
        this.b = instant2;
    }

    public ulw(defpackage.aelu aeluVar, j$.util.Optional optional, j$.util.Optional optional2) {
        aooh.f(optional, "loaderWrapper");
        aooh.f(optional2, "uriLoader");
        this.a = aeluVar;
        this.b = optional;
        this.c = optional2;
    }

    public ulw(byte[] bArr) {
        this.a = new aift(4);
        this.c = new aift(4);
        this.b = "DEFAULT";
    }

    public ulw() {
        java.util.EnumMap enumMap = new java.util.EnumMap(defpackage.akvy.class);
        this.a = "";
        this.c = enumMap;
        this.b = new java.util.EnumMap(defpackage.akvy.class);
    }

    public ulw(aoin aoinVar, aoin aoinVar2, aoin aoinVar3) {
        aoinVar.getClass();
        this.a = aoinVar;
        aoinVar2.getClass();
        this.b = aoinVar2;
        aoinVar3.getClass();
        this.c = aoinVar3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public ulw(defpackage.ulw ulwVar) {
        this.a = ulwVar.a;
        this.c = new java.util.EnumMap((java.util.Map) ulwVar.c);
        this.b = new java.util.EnumMap((java.util.Map) ulwVar.b);
    }
}
