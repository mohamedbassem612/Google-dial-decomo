    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(aoln aolnVar) {
        hym hymVar;
        aoot aootVar;
        if (aolnVar instanceof hym) {
            hymVar = (hym) aolnVar;
            int i = hymVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hymVar.c = i - Integer.MIN_VALUE;
            } else {
                hymVar = new hym(this, aolnVar);
            }
        } else {
            hymVar = new hym(this, aolnVar);
        }
        Object obj = hymVar.a;
        aolu aoluVar = aolu.a;
        int i2 = hymVar.c;
        if (i2 == 0) {
            aooc.af(obj);
            aoot aootVar2 = new aoot();
            hymVar.d = aootVar2;
            hymVar.c = 1;
            aosc aoscVar = new aosc(ajsz.ap(hymVar), 1);
            aoscVar.z();
            aootVar2.a = new TextToSpeech(this.d, new hyn(aoscVar, this, 0));
            if (aoscVar.k() == aoluVar) {
                return aoluVar;
            }
            aootVar = aootVar2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aootVar = hymVar.d;
            aooc.af(obj);
        }
        Object obj2 = aootVar.a;
        if (obj2 != null) {
            return (TextToSpeech) obj2;
        }
        aooh.j("textToSpeech");
        return null;
    }
