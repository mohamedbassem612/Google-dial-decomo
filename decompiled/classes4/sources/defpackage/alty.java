package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alty {
    public final double a;
    public final int b;
    public final int c;
    private final int d;

    public alty(double d, int i, int i2, int i3) {
        this.a = d;
        this.b = i;
        this.d = i2;
        this.c = i3;
    }

    public static defpackage.altx b() {
        defpackage.altx altxVar = new defpackage.altx();
        altxVar.a = 1.7d;
        altxVar.c = (byte) (altxVar.c | 1);
        altxVar.b(2);
        altxVar.b = 2;
        altxVar.c = (byte) (altxVar.c | 4);
        altxVar.d = 3;
        return altxVar;
    }

    private static aify c(final aify aifyVar, final int i, final int i2) {
        final java.util.ArrayList arrayList = new java.util.ArrayList((java.util.Collection) aifyVar);
        j$.util.stream.IntStream.-CC.range(0, aifyVar.size()).filter(new java.util.function.IntPredicate() { // from class: altu
            @Override // java.util.function.IntPredicate
            public final /* synthetic */ java.util.function.IntPredicate and(java.util.function.IntPredicate intPredicate) {
                return j$.util.function.IntPredicate.-CC.$default$and(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final /* synthetic */ java.util.function.IntPredicate negate() {
                return j$.util.function.IntPredicate.-CC.$default$negate(this);
            }

            @Override // java.util.function.IntPredicate
            public final /* synthetic */ java.util.function.IntPredicate or(java.util.function.IntPredicate intPredicate) {
                return j$.util.function.IntPredicate.-CC.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i3) {
                return ((java.lang.Integer) aifyVar.get(i3)).intValue() == i;
            }
        }).forEach(new java.util.function.IntConsumer() { // from class: altv
            @Override // java.util.function.IntConsumer
            public final void accept(int i3) {
                int i4 = i2;
                j$.util.stream.IntStream intStreamRange = j$.util.stream.IntStream.-CC.range(i3, java.lang.Math.min(i3 + 1 + i4, aifyVar.size()));
                final java.util.ArrayList arrayList2 = arrayList;
                final int i5 = i;
                final int i6 = 1;
                intStreamRange.forEach(new java.util.function.IntConsumer() { // from class: alts
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i7) {
                        int i8 = i6;
                        int i9 = i5;
                        java.util.ArrayList arrayList3 = arrayList2;
                        if (i8 != 0) {
                            arrayList3.set(i7, java.lang.Integer.valueOf(i9));
                        } else {
                            arrayList3.set(i7, java.lang.Integer.valueOf(i9));
                        }
                    }

                    @Override // java.util.function.IntConsumer
                    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
                        return i6 != 0 ? j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer) : j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer);
                    }
                });
                int i7 = i3 - i4;
                final int i8 = 0;
                j$.util.stream.IntStream.-CC.range(java.lang.Math.max(i7, 0), i3).forEach(new java.util.function.IntConsumer() { // from class: alts
                    @Override // java.util.function.IntConsumer
                    public final void accept(int i9) {
                        int i10 = i8;
                        int i11 = i5;
                        java.util.ArrayList arrayList3 = arrayList2;
                        if (i10 != 0) {
                            arrayList3.set(i9, java.lang.Integer.valueOf(i11));
                        } else {
                            arrayList3.set(i9, java.lang.Integer.valueOf(i11));
                        }
                    }

                    @Override // java.util.function.IntConsumer
                    public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
                        return i8 != 0 ? j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer) : j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer);
                    }
                });
            }

            @Override // java.util.function.IntConsumer
            public final /* synthetic */ java.util.function.IntConsumer andThen(java.util.function.IntConsumer intConsumer) {
                return j$.util.function.IntConsumer.-CC.$default$andThen(this, intConsumer);
            }
        });
        return aify.n(arrayList);
    }

    public final aify a(alqu alquVar, boolean z) {
        aify aifyVar;
        int i = 2;
        int i2 = 1;
        j$.util.Optional optionalFindFirst = j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream((alquVar.c == 2 ? (defpackage.alqr) alquVar.d : defpackage.alqr.a).b), j$.util.Collection.-EL.stream((alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b)).findFirst();
        if (optionalFindFirst.isEmpty()) {
            return aike.a;
        }
        defpackage.alqq alqqVar = (defpackage.alqq) optionalFindFirst.get();
        int iCeil = (int) java.lang.Math.ceil(((double) this.d) / 2.0d);
        defpackage.alqp alqpVar = alqqVar.e;
        if (alqpVar == null) {
            alqpVar = defpackage.alqp.a;
        }
        int i3 = 5;
        if (j$.util.Collection.-EL.stream(alqpVar.b).anyMatch(new defpackage.altw(0))) {
            aifyVar = (aify) j$.util.Collection.-EL.stream(alqpVar.b).map(new defpackage.alpp(i3)).map(new defpackage.aite(this, 18)).collect(aido.a);
        } else if (j$.util.Collection.-EL.stream(alqpVar.b).anyMatch(new defpackage.altw(i))) {
            alat alatVar = alqpVar.b;
            aifyVar = (aify) j$.util.stream.IntStream.-CC.range(0, alatVar.size()).mapToObj(new defpackage.amep(this, alatVar, 1)).collect(aido.a);
        } else {
            aifyVar = aike.a;
        }
        int i4 = iCeil + 1;
        java.util.List listNCopies = java.util.Collections.nCopies(i4, 0);
        j$.util.stream.Stream streamFlatMap = j$.util.stream.Stream.-CC.of(new j$.util.stream.Stream[]{j$.util.Collection.-EL.stream(listNCopies), j$.util.Collection.-EL.stream(aifyVar), j$.util.Collection.-EL.stream(listNCopies)}).flatMap(new defpackage.alpp(3));
        j$.util.stream.Collector collector = aido.a;
        aify aifyVarC = (aify) streamFlatMap.collect(collector);
        if (z) {
            aifyVarC = c(c(aifyVarC, 1, iCeil), 0, iCeil);
        }
        defpackage.alqp alqpVar2 = alqqVar.e;
        if (alqpVar2 == null) {
            alqpVar2 = defpackage.alqp.a;
        }
        aify aifyVar2 = (aify) j$.util.Collection.-EL.stream(aifyVarC).skip(i4).limit(alqpVar2.b.size()).collect(collector);
        int size = (alquVar.c == 1 ? (defpackage.alqm) alquVar.d : defpackage.alqm.a).b.size();
        defpackage.alqq alqqVar2 = (defpackage.alqq) optionalFindFirst.get();
        defpackage.alqp alqpVar3 = alqqVar2.e;
        if (alqpVar3 == null) {
            alqpVar3 = defpackage.alqp.a;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        j$.util.stream.Stream streamConcat = j$.util.stream.Stream.-CC.concat(j$.util.stream.Stream.-CC.of(0), j$.util.Collection.-EL.stream(alqpVar3.b).map(new defpackage.alpp(6)));
        j$.util.Objects.requireNonNull(atomicInteger);
        aify aifyVar3 = (aify) streamConcat.map(new defpackage.aite(atomicInteger, 19)).collect(collector);
        final int length = size == 0 ? ((java.lang.String) j$.util.Collection.-EL.stream(alqqVar2.d).limit(j$.util.stream.IntStream.-CC.range(0, alqqVar2.d.size()).filter(new defpackage.altq(alqqVar2, 0)).max().orElseGet(new defpackage.altt()) + 1).map(new defpackage.alpp(4)).collect(j$.util.stream.Collectors.joining())).split(" ").length - 1 : alqpVar3.b.size();
        return (aify) new aits(j$.util.stream.IntStream.-CC.range(0, aifyVar2.size()).filter(new defpackage.altq(aifyVar2, 2)).boxed(), j$.util.stream.IntStream.-CC.range(0, aifyVar2.size()).filter(new defpackage.altq(aifyVar2, 3)).boxed()).h(new defpackage.aluj(this, i2)).h(new java.util.function.BiPredicate() { // from class: altr
            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate and(java.util.function.BiPredicate biPredicate) {
                return j$.util.function.BiPredicate.-CC.$default$and(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate negate() {
                return j$.util.function.BiPredicate.-CC.$default$negate(this);
            }

            @Override // java.util.function.BiPredicate
            public final /* synthetic */ java.util.function.BiPredicate or(java.util.function.BiPredicate biPredicate) {
                return j$.util.function.BiPredicate.-CC.$default$or(this, biPredicate);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(java.lang.Object obj, java.lang.Object obj2) {
                return ((java.lang.Integer) obj).intValue() < length;
            }
        }).c(new defpackage.exw(length, 7)).b(new defpackage.aite(aifyVar3, 16)).c(new defpackage.aite(aifyVar3, 17)).d(new defpackage.aitf(i3)).collect(collector);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alty) {
            defpackage.alty altyVar = (defpackage.alty) obj;
            if (java.lang.Double.doubleToLongBits(this.a) == java.lang.Double.doubleToLongBits(altyVar.a) && this.b == altyVar.b && this.d == altyVar.d) {
                int i = this.c;
                int i2 = altyVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.a;
        return ((((((((int) ((java.lang.Double.doubleToLongBits(d) >>> 32) ^ java.lang.Double.doubleToLongBits(d))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.d) * 1000003) ^ a.aq(this.c);
    }

    public final java.lang.String toString() {
        int i = this.c;
        return "UnintelligibleAudioDetectorSodaImpl{costThreshold=" + this.a + ", blockSizeThreshold=" + this.b + ", blockProximityThreshold=" + this.d + ", confidenceThreshold=" + (i != 0 ? java.lang.Integer.toString(i - 1) : "null") + '}';
    }

    public alty() {
        throw null;
    }
}
