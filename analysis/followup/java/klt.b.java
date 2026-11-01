    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(aoln aolnVar) {
        kum kumVar;
        if (aolnVar instanceof kum) {
            kumVar = (kum) aolnVar;
            int i = kumVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                kumVar.b = i - Integer.MIN_VALUE;
            } else {
                kumVar = new kum(this, aolnVar);
            }
        } else {
            kumVar = new kum(this, aolnVar);
        }
        Object objD = kumVar.a;
        aolu aoluVar = aolu.a;
        int i2 = kumVar.b;
        if (i2 == 0) {
            aooc.af(objD);
            ajcq ajcqVarAX = ((aogc) this.e).aX();
            kumVar.b = 1;
            objD = aosv.D(ajcqVarAX, kumVar);
            if (objD == aoluVar) {
                return aoluVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aooc.af(objD);
        }
        zzx zzxVar = (zzx) this.f;
        if (true != zzxVar.k().containsKey((kun) objD)) {
            objD = null;
        }
        kun kunVar = (kun) objD;
        if (kunVar != null) {
            return kunVar;
        }
        Set setKeySet = zzxVar.k().keySet();
        aooh.e(setKeySet, "<get-keys>(...)");
        Iterator it = setKeySet.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int i3 = ((kun) next).e;
            do {
                Object next2 = it.next();
                int i4 = ((kun) next2).e;
                if (i3 < i4) {
                    next = next2;
                    i3 = i4;
                }
            } while (it.hasNext());
        }
        return (kun) next;
    }
