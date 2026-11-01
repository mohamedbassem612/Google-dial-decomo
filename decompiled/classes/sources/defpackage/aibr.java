package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aibr extends java.util.AbstractQueue {
    final defpackage.aibu a = new defpackage.aibp(this);

    @Override // java.util.Queue
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.aibu peek() {
        defpackage.aibu aibuVar = this.a;
        defpackage.aibu aibuVar2 = ((defpackage.aibp) aibuVar).a;
        if (aibuVar2 == aibuVar) {
            return null;
        }
        return aibuVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        defpackage.aibu aibuVar = this.a;
        defpackage.aibp aibpVar = (defpackage.aibp) aibuVar;
        defpackage.aibu aibuVar2 = aibpVar.a;
        while (aibuVar2 != aibuVar) {
            defpackage.aibu aibuVarG = aibuVar2.g();
            defpackage.aibt.f(aibuVar2);
            aibuVar2 = aibuVarG;
        }
        aibpVar.a = aibuVar;
        aibpVar.b = aibuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return ((defpackage.aibu) obj).g() != defpackage.aiay.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        defpackage.aibu aibuVar = this.a;
        return ((defpackage.aibp) aibuVar).a == aibuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new aibq(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(java.lang.Object obj) {
        defpackage.aibu aibuVar = (defpackage.aibu) obj;
        defpackage.aibu aibuVarI = aibuVar.i();
        defpackage.aibu aibuVarG = aibuVar.g();
        defpackage.aibi aibiVar = defpackage.aibt.b;
        aibuVarI.m(aibuVarG);
        aibuVarG.o(aibuVarI);
        defpackage.aibu aibuVar2 = this.a;
        defpackage.aibp aibpVar = (defpackage.aibp) aibuVar2;
        defpackage.aibu aibuVar3 = aibpVar.b;
        aibuVar3.m(aibuVar);
        aibuVar.o(aibuVar3);
        aibuVar.m(aibuVar2);
        aibpVar.b = aibuVar;
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ java.lang.Object poll() {
        defpackage.aibu aibuVar = this.a;
        defpackage.aibu aibuVar2 = ((defpackage.aibp) aibuVar).a;
        if (aibuVar2 == aibuVar) {
            return null;
        }
        remove(aibuVar2);
        return aibuVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        defpackage.aibu aibuVar = (defpackage.aibu) obj;
        defpackage.aibu aibuVarI = aibuVar.i();
        defpackage.aibu aibuVarG = aibuVar.g();
        defpackage.aibi aibiVar = defpackage.aibt.b;
        aibuVarI.m(aibuVarG);
        aibuVarG.o(aibuVarI);
        defpackage.aiay aiayVar = defpackage.aiay.INSTANCE;
        aibuVar.m(aiayVar);
        aibuVar.o(aiayVar);
        return aibuVarG != aiayVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        defpackage.aibu aibuVar = this.a;
        int i = 0;
        for (defpackage.aibu aibuVarG = ((defpackage.aibp) aibuVar).a; aibuVarG != aibuVar; aibuVarG = aibuVarG.g()) {
            i++;
        }
        return i;
    }
}
