package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aiai extends java.util.AbstractQueue {
    final defpackage.aibu a = new defpackage.aiag(this);

    @Override // java.util.Queue
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.aibu peek() {
        defpackage.aibu aibuVar = this.a;
        defpackage.aibu aibuVar2 = ((defpackage.aiag) aibuVar).a;
        if (aibuVar2 == aibuVar) {
            return null;
        }
        return aibuVar2;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        defpackage.aibu aibuVar = this.a;
        defpackage.aiag aiagVar = (defpackage.aiag) aibuVar;
        defpackage.aibu aibuVar2 = aiagVar.a;
        while (aibuVar2 != aibuVar) {
            defpackage.aibu aibuVarF = aibuVar2.f();
            defpackage.aibt.e(aibuVar2);
            aibuVar2 = aibuVarF;
        }
        aiagVar.a = aibuVar;
        aiagVar.b = aibuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return ((defpackage.aibu) obj).f() != defpackage.aiay.INSTANCE;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        defpackage.aibu aibuVar = this.a;
        return ((defpackage.aiag) aibuVar).a == aibuVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new aiah(this, peek());
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ boolean offer(java.lang.Object obj) {
        defpackage.aibu aibuVar = (defpackage.aibu) obj;
        defpackage.aibu aibuVarH = aibuVar.h();
        defpackage.aibu aibuVarF = aibuVar.f();
        defpackage.aibi aibiVar = defpackage.aibt.b;
        aibuVarH.l(aibuVarF);
        aibuVarF.n(aibuVarH);
        defpackage.aibu aibuVar2 = this.a;
        defpackage.aiag aiagVar = (defpackage.aiag) aibuVar2;
        defpackage.aibu aibuVar3 = aiagVar.b;
        aibuVar3.l(aibuVar);
        aibuVar.n(aibuVar3);
        aibuVar.l(aibuVar2);
        aiagVar.b = aibuVar;
        return true;
    }

    @Override // java.util.Queue
    public final /* bridge */ /* synthetic */ java.lang.Object poll() {
        defpackage.aibu aibuVar = this.a;
        defpackage.aibu aibuVar2 = ((defpackage.aiag) aibuVar).a;
        if (aibuVar2 == aibuVar) {
            return null;
        }
        remove(aibuVar2);
        return aibuVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        defpackage.aibu aibuVar = (defpackage.aibu) obj;
        defpackage.aibu aibuVarH = aibuVar.h();
        defpackage.aibu aibuVarF = aibuVar.f();
        defpackage.aibi aibiVar = defpackage.aibt.b;
        aibuVarH.l(aibuVarF);
        aibuVarF.n(aibuVarH);
        defpackage.aiay aiayVar = defpackage.aiay.INSTANCE;
        aibuVar.l(aiayVar);
        aibuVar.n(aiayVar);
        return aibuVarF != aiayVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        defpackage.aibu aibuVar = this.a;
        int i = 0;
        for (defpackage.aibu aibuVarF = ((defpackage.aiag) aibuVar).a; aibuVarF != aibuVar; aibuVarF = aibuVarF.f()) {
            i++;
        }
        return i;
    }
}
